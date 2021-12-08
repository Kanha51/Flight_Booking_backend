package com.flightapp.users.service;

import com.flightapp.users.config.ProducerClientConfig;
import com.flightapp.users.dto.*;
import com.flightapp.users.entity.FlightBookingDetailEntity;
import com.flightapp.users.entity.PassangerDetailEntity;
import com.flightapp.users.repository.FlightBookingDetailRepository;
import com.flightapp.users.repository.PassangerDetailRepository;
import com.flightapp.users.util.UserConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * The type Flight user operation service.
 */
@Service
public class FlightUserOperationService {

    /**
     * The Flight booking detail repository.
     */
    @Autowired
    private FlightBookingDetailRepository flightBookingDetailRepository;

    /**
     * The Rest template.
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * The Config.
     */
    @Autowired
    private ProducerClientConfig config;

    /**
     * The Passanger repo.
     */
    @Autowired
    private PassangerDetailRepository passangerRepo;

    /**
     * Book ticket pnr dto.
     *
     * @param bookingDetail the booking detail
     * @return the pnr dto
     */
    public PnrDto bookTicket(FlightBookingDto bookingDetail) {

        PnrDto returnDto = new PnrDto();
        FlightBookingDetailEntity entity = new FlightBookingDetailEntity(bookingDetail.getFlightNo(),
                bookingDetail.getDateTime(), bookingDetail.getFlightFrom(), bookingDetail.getFlightTo(),
                bookingDetail.getCustomerName(), bookingDetail.getCustomerEmailId(), bookingDetail.getNoOfSeats(),
                bookingDetail.getMealType(), generatePnrNo());
        entity = flightBookingDetailRepository.save(entity);
        List<PassangerDetailEntity> passangerData = new ArrayList<>();
        for (FlightPassangerInfoDto passengerDto : bookingDetail.getPassangerInfo()) {
            passangerData.add(new PassangerDetailEntity(entity, passengerDto.getPassangerName(),
                    passengerDto.getPassangerGender(), passengerDto.getPassangerAge()));
        }
        passangerRepo.saveAll(passangerData);
        returnDto.setPnrNo(entity.getPnrNo());
        return returnDto;
    }

    /**
     * Generate pnr no string.
     *
     * @return the string
     */
    private String generatePnrNo() {
        final String CHARACTER_SET = "23456789ABCDEFGHIJKLMNPQRSTUVWXYZ";
        Random rnd = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            builder.append(CHARACTER_SET.charAt(rnd.nextInt(CHARACTER_SET.length())));
        }
        String pnrNo = builder.toString();
        List<FlightBookingDetailEntity> pnrNoData = flightBookingDetailRepository.findByPnrNo(pnrNo);
        if (!pnrNoData.isEmpty()) {
            pnrNo = generatePnrNo();
        }
        return pnrNo;

    }

    /**
     * Cancel ticket user flight status dto.
     *
     * @param pnrNo the pnr no
     * @return the user flight status dto
     */
    public UserFlightStatusDto cancelTicket(String pnrNo) {
        UserFlightStatusDto returnDto = new UserFlightStatusDto();
        List<FlightBookingDetailEntity> entityData = flightBookingDetailRepository.findByPnrNo(pnrNo);
        if (!entityData.isEmpty()) {
            FlightBookingDetailEntity entity = entityData.get(0);
            entity.setCancelTicket(UserConstant.INACTIVE_FLAG);
            flightBookingDetailRepository.save(entity);
            returnDto.setStatus("Flight Cancelled");
        }
        return returnDto;
    }


    /**
     * Search flight details by email or pnr list.
     *
     * @param emailIdPnr the email id pnr
     * @return the list
     */
    public List<FlightBookingDetailEntity> searchFlightDetailsByEmailOrPnr(String emailIdPnr) {
        return flightBookingDetailRepository.findByCustomerEmailIdOrPnrNo(emailIdPnr, emailIdPnr);
    }

    /**
     * Serch flight by param list.
     *
     * @param searchParam the search param
     * @return the list
     */
    public List<FlightSearchResultDto> serchFlightByParam(FlightSearchDto searchParam) {
        Object[] response = restTemplate.getForObject("http://" + config.getProducerService() +
                "/api/v1.0/search", Object[].class, searchParam);

        return new ArrayList(Arrays.asList(response));
    }
}

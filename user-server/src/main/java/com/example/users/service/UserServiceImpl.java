package com.example.users.service;

import com.example.users.dto.*;
import com.example.users.entity.FlightBookingDetailEntity;
import com.example.users.entity.PassangerDetailEntity;
import com.example.users.entity.UserLoginEntity;
import com.example.users.repository.FlightBookingDetailRepository;
import com.example.users.repository.PassangerDetailRepository;
import com.example.users.util.UserConstant;
import org.apache.commons.lang.RandomStringUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Flight user operation service.
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * The Flight booking detail repository.
     */
    private FlightBookingDetailRepository flightBookingDetailRepository;

    /**
     * The Passanger repo.
     */
    private PassangerDetailRepository passangerRepo;

    private ModelMapper modelMapper;

    public UserServiceImpl(FlightBookingDetailRepository flightBookingDetailRepository, PassangerDetailRepository passangerRepo, ModelMapper modelMapper) {
        this.flightBookingDetailRepository = flightBookingDetailRepository;
        this.passangerRepo = passangerRepo;
        this.modelMapper = modelMapper;
    }

    /**
     * Book ticket pnr dto.
     *
     * @param bookingDetail the booking detail
     * @return the pnr dto
     */
    @Override
    public PnrDto bookTicket(FlightBookingDto bookingDetail) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        PnrDto returnDto = new PnrDto();
        FlightBookingDetailEntity entity = modelMapper.map(bookingDetail, FlightBookingDetailEntity.class);
        entity.setUserId(new UserLoginEntity(bookingDetail.getUserId()));
        entity.setPnrNo(RandomStringUtils.randomAlphanumeric(8).toUpperCase());
        entity = flightBookingDetailRepository.save(entity);
        List<PassangerDetailEntity> passangerData = new ArrayList<>();
        for (FlightPassangerInfoDto passengerDto : bookingDetail.getPassangerInfo()) {
            PassangerDetailEntity passangerDetailEntity = new PassangerDetailEntity();
            passangerDetailEntity = modelMapper.map(passengerDto, PassangerDetailEntity.class);
            passangerDetailEntity.setUserId(entity.getUserId());
            passangerDetailEntity.setFlightId(entity);
            passangerData.add(passangerDetailEntity);
        }
        passangerRepo.saveAll(passangerData);
        returnDto.setPnrNo(entity.getPnrNo());
        return returnDto;
    }


    /**
     * Cancel ticket user flight status dto.
     *
     * @param pnrNo the pnr no
     * @return the user flight status dto
     */
    @Override
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

    @Override
    public List<FlightHistoryDto> getFlightHistory(FlightHistoryRequestDto dto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<FlightHistoryDto> resultList = new ArrayList<>();
        List<FlightBookingDetailEntity> flightEntityList = flightBookingDetailRepository.findByUserId(new UserLoginEntity(dto.getUserId()));
        for (FlightBookingDetailEntity flightEntity : flightEntityList) {
            FlightHistoryDto resultDto = new FlightHistoryDto();
            List<PassangerDetailEntity> passangerEntityList = passangerRepo.findByFlightId(new FlightBookingDetailEntity(flightEntity.getFlightBookingDetailId()));
            List<FlightPassangerInfoDto> passangersInfo = new ArrayList<>();
            for (PassangerDetailEntity passangerEntity : passangerEntityList) {
                passangersInfo.add(modelMapper.map(passangerEntity, FlightPassangerInfoDto.class));
            }

            resultDto = modelMapper.map(flightEntity, FlightHistoryDto.class);
            resultDto.setPassangersInfo(passangersInfo);
            resultList.add(resultDto);
        }
        return resultList;
    }


}

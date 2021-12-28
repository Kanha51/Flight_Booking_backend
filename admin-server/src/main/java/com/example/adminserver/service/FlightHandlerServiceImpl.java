package com.example.adminserver.service;

import com.example.adminserver.dto.*;
import com.example.adminserver.entity.AirlineDataEntity;
import com.example.adminserver.entity.FlightScheduleEntity;
import com.example.adminserver.exception.DataNotFoundException;
import com.example.adminserver.repository.AirlineDataRepository;
import com.example.adminserver.repository.FlightScheduleRepository;
import org.apache.commons.lang.RandomStringUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The Class FlightHandlerServiceImpl.
 */
@Service
public class FlightHandlerServiceImpl implements FlightHandlerService {

    /**
     * The model mapper.
     */
    private final ModelMapper modelMapper;

    /**
     * The airline data repository.
     */
    private final AirlineDataRepository airlineDataRepository;

    /**
     * The flight schedule repo.
     */
    private final FlightScheduleRepository flightScheduleRepo;

    /**
     * Instantiates a new flight handler service impl.
     *
     * @param modelMapper           the model mapper
     * @param airlineDataRepository the airline data repository
     * @param flightScheduleRepo    the flight schedule repo
     */
    public FlightHandlerServiceImpl(ModelMapper modelMapper, AirlineDataRepository airlineDataRepository,
                                    FlightScheduleRepository flightScheduleRepo) {
        this.modelMapper = modelMapper;
        this.airlineDataRepository = airlineDataRepository;
        this.flightScheduleRepo = flightScheduleRepo;
    }

    @Override
    public List<AirlineDataRequestDto> getAirlinreData() {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        final List<AirlineDataEntity> entityList = airlineDataRepository.findByBlock(0);
        if (entityList.isEmpty()) {
            throw new DataNotFoundException("No Airline Data Found");
        }
        List<AirlineDataRequestDto> resultList = new ArrayList<>();
        for (AirlineDataEntity entity : entityList) {
            resultList.add(modelMapper.map(entity, AirlineDataRequestDto.class));
        }

        return resultList;
    }

    @Override
    public AirlineDataRequestDto addAirline(AirlineDataRequestDto airlineDataDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        final String str[] = UUID.randomUUID().toString().split("-");
        AirlineDataEntity airlineEntity = new AirlineDataEntity();
        airlineEntity = modelMapper.map(airlineDataDto, AirlineDataEntity.class);
        if (airlineDataDto.getFlightNo() != null) {
            final AirlineDataEntity entity = airlineDataRepository.findByFlightNo(airlineDataDto.getFlightNo());
            airlineEntity.setUniqueId(entity.getUniqueId());
            airlineEntity.setId(entity.getId());
        } else {
            airlineEntity.setUniqueId(str[0]);
            airlineEntity.setFlightNo(RandomStringUtils.randomAlphanumeric(6).toUpperCase());
            addFlightSchedule(airlineEntity.getFlightNo());
        }

        return modelMapper.map(airlineDataRepository.save(airlineEntity), AirlineDataRequestDto.class);
    }

    /**
     * Adds the flight schedule.
     *
     * @param flightNo the flight no
     */
    private void addFlightSchedule(String flightNo) {
        final FlightScheduleEntity flightScheduleEntity = new FlightScheduleEntity();

        flightScheduleEntity.setFlightNo(flightNo);
        flightScheduleRepo.save(flightScheduleEntity);
    }

    @Override
    public AirlineDataResponseDto blockAirline(AirlineBlockRequestModel airlineDataDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AirlineDataEntity airlineEntity = airlineDataRepository.findByFlightNo(airlineDataDto.getFlightNo());
        if (airlineEntity == null) {
            throw new DataNotFoundException("No Flight Data Found");
        }
        airlineEntity.setBlock(1);
        final FlightScheduleEntity scheduleEntity = flightScheduleRepo.findByFlightNo(airlineDataDto.getFlightNo());
        scheduleEntity.setBlock(1);
        flightScheduleRepo.save(scheduleEntity);
        return modelMapper.map(airlineDataRepository.save(airlineEntity), AirlineDataResponseDto.class);
    }

    @Override
    public FlightScheduleRequestDto flightSchedule(FlightScheduleRequestDto flightScheduleDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        final FlightScheduleEntity flightScheduleEntity = flightScheduleRepo
                .findByFlightNo(flightScheduleDto.getFlightNo());
        FlightScheduleEntity entity = modelMapper.map(flightScheduleDto, FlightScheduleEntity.class);
        entity.setId(flightScheduleEntity.getId());
        entity.setFlightNo(flightScheduleEntity.getFlightNo());
        entity = flightScheduleRepo.save(entity);
        return flightScheduleDto;

    }

    @Override
    public List<FlightScheduleRequestDto> getAllFlightData() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<FlightScheduleRequestDto> resultDtoList = new ArrayList<>();
        List<FlightScheduleEntity> flightDataEntityList = flightScheduleRepo.findByBlock(0);
        if (flightDataEntityList.isEmpty()) {
            throw new DataNotFoundException("No Flight Data Found");
        }
        for (FlightScheduleEntity flightEntity : flightDataEntityList) {
            FlightScheduleRequestDto resultDto = modelMapper.map(flightEntity, FlightScheduleRequestDto.class);

            resultDtoList.add(resultDto);
        }
        return resultDtoList;
    }

    @Override
    public List<FlightSearchResultDto> searchFlights(FlightSearchDto dto) {
        final List<AirlineDataEntity> entityList = airlineDataRepository
                .findByFromFlightCodeAndToFlightCodeAndStartDateAndBlock(dto.getFromPlace(), dto.getToPlace(),
                        dto.getTravelStartDate(), 0);
        if (entityList.isEmpty()) {
            throw new DataNotFoundException("No Flights Found");
        }
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<FlightSearchResultDto> resultList = new ArrayList<>();
        for (AirlineDataEntity entity : entityList) {
            FlightSearchResultDto resultDto = new FlightSearchResultDto();
            resultDto = modelMapper.map(entity, FlightSearchResultDto.class);
            final FlightScheduleEntity scheduleEntity = flightScheduleRepo
                    .findByFlightNoAndNonBusinessSeatsNotAndBusinessSeatsNot(resultDto.getFlightNo(), 0l, 0l);
            resultDto.setCost(scheduleEntity.getTicketCost());
            resultDto.setTakeOffTime(scheduleEntity.getTakeOffTime());
            resultDto.setLandingTime(scheduleEntity.getLandingTime());
            resultDto.setFlightDate(entity.getStartDate());
            resultDto.setNonBusinesSeats(scheduleEntity.getNonBusinessSeats());
            resultDto.setBusinessSeats(scheduleEntity.getBusinessSeats());
            resultDto.setTax(scheduleEntity.getTax());
            resultList.add(resultDto);
        }
        return resultList;
    }

    @Override
    public TicketUpdateDto ticketUpdate(TicketUpdateDto dto) {
        final FlightScheduleEntity entity = flightScheduleRepo.findByFlightNo(dto.getFlightNo());
        if (dto.getAddTicket() == 1) {
            if (dto.getSeatType() == 0) {
                entity.setNonBusinessSeats(entity.getNonBusinessSeats() + 1);
            } else if (dto.getSeatType() == 1) {
                entity.setBusinessSeats(entity.getBusinessSeats() + 1);
            }
        } else if (dto.getCancelTicket() == 1) {
            if (dto.getSeatType() == 0) {
                entity.setNonBusinessSeats(entity.getNonBusinessSeats() - 1);
            } else if (dto.getSeatType() == 1) {
                entity.setBusinessSeats(entity.getBusinessSeats() - 1);
            }
        }
        flightScheduleRepo.save(entity);
        return dto;
    }
}

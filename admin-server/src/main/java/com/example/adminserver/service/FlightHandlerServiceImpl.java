package com.example.adminserver.service;


import com.example.adminserver.dto.*;
import com.example.adminserver.entity.AirlineDataEntity;
import com.example.adminserver.entity.FlightDataEntity;
import com.example.adminserver.entity.FlightScheduleEntity;
import com.example.adminserver.entity.FlightSeatPriceEntity;
import com.example.adminserver.repository.AirlineDataRepository;
import com.example.adminserver.repository.FlightDataRepository;
import com.example.adminserver.repository.FlightScheduleRepository;
import com.example.adminserver.repository.FlightSeatPriceRepository;
import org.apache.commons.lang.RandomStringUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FlightHandlerServiceImpl implements FlightHandlerService {

    private ModelMapper modelMapper;

    private AirlineDataRepository airlineDataRepository;

    private FlightDataRepository flightDataRepo;

    private FlightScheduleRepository flightScheduleRepo;
    private FlightSeatPriceRepository flightSeatPriceRepo;

    public FlightHandlerServiceImpl(ModelMapper modelMapper, AirlineDataRepository airlineDataRepository,
                                    FlightDataRepository flightDataRepo, FlightScheduleRepository flightScheduleRepo,
                                    FlightSeatPriceRepository flightSeatPriceRepo) {
        this.modelMapper = modelMapper;
        this.airlineDataRepository = airlineDataRepository;
        this.flightDataRepo = flightDataRepo;
        this.flightScheduleRepo = flightScheduleRepo;
        this.flightSeatPriceRepo = flightSeatPriceRepo;
    }

    @Override
    public AirlineDataDtoList getAirlinreData() {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<AirlineDataEntity> entityList = airlineDataRepository.findAll();
        List<AirlineDataDto> resultList = new ArrayList<>();
        for (AirlineDataEntity entity : entityList) {
            resultList.add(modelMapper.map(entity, AirlineDataDto.class));
        }
        AirlineDataDtoList result = new AirlineDataDtoList();
        result.setAirlineDataList(resultList);
        return result;
    }

    @Override
    public AirlineDataResponseDto addAirline(AirlineDataRequestDto airlineDataDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        String str[] = UUID.randomUUID().toString().split("-");
        AirlineDataEntity airlineEntity = modelMapper.map(airlineDataDto, AirlineDataEntity.class);
        airlineEntity.setUniqueId(str[0]);
        return modelMapper.map(airlineDataRepository.save(airlineEntity), AirlineDataResponseDto.class);
    }

    @Override
    public AirlineDataResponseDto blockAirline(AirlineBlockRequestModel airlineDataDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        AirlineDataEntity airlineEntity = airlineDataRepository.findByUniqueId(airlineDataDto.getUniqueAirlineId());
        airlineEntity.setBlock(1);
        return modelMapper.map(airlineDataRepository.save(airlineEntity), AirlineDataResponseDto.class);
    }

    @Override
    public FlightScheduleResponseDto flightSchedule(FlightScheduleRequestDto flightScheduleDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        FlightDataEntity flightDataEntity = modelMapper.map(flightScheduleDto, FlightDataEntity.class);
        flightDataEntity = flightDataRepo.save(flightDataEntity);
        FlightScheduleEntity flightScheduleEntity = modelMapper.map(flightScheduleDto,
                FlightScheduleEntity.class);
        flightScheduleEntity.setFlightNo(RandomStringUtils.randomAlphanumeric(6).toUpperCase());
        flightScheduleEntity = flightScheduleRepo.save(flightScheduleEntity);
        FlightSeatPriceEntity flightSeatPriceEntity = modelMapper.map(flightScheduleDto,
                FlightSeatPriceEntity.class);
        flightSeatPriceEntity = flightSeatPriceRepo.save(flightSeatPriceEntity);

        return new FlightScheduleResponseDto(flightScheduleEntity.getFlightNo());

    }
}

package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AirlineDataDto;
import com.example.demo.dto.FlightDataDto;
import com.example.demo.dto.FlightInfoScheduleDto;
import com.example.demo.dto.FlightScheduleDto;
import com.example.demo.dto.FlightSeatPriceDto;
import com.example.demo.entity.AirlineDataEntity;
import com.example.demo.entity.FlightDataEntity;
import com.example.demo.entity.FlightScheduleEntity;
import com.example.demo.entity.FlightSeatPriceEntity;
import com.example.demo.repository.AirlineDataRepository;
import com.example.demo.repository.FlightDataRepository;
import com.example.demo.repository.FlightScheduleRepository;
import com.example.demo.repository.FlightSeatPriceRepository;

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
	public AirlineDataDto addAirline(AirlineDataDto airlineDataDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AirlineDataEntity airlineEntity = modelMapper.map(airlineDataDto, AirlineDataEntity.class);
		return modelMapper.map(airlineDataRepository.save(airlineEntity), AirlineDataDto.class);
	}

	@Override
	public AirlineDataDto blockAirline(AirlineDataDto airlineDataDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		AirlineDataEntity airlineEntity = airlineDataRepository.findByAirlineNameOrContactNoOrAirlineAddress(
				airlineDataDto.getAirlineName(), airlineDataDto.getContactNo(), airlineDataDto.getAirlineAddress());
		airlineEntity.setBlock(1);
		return modelMapper.map(airlineDataRepository.save(airlineEntity), AirlineDataDto.class);
	}

	@Override
	public FlightInfoScheduleDto flightSchedule(FlightInfoScheduleDto flightScheduleDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		FlightDataEntity flightDataEntity = modelMapper.map(flightScheduleDto.getFlihgtData(), FlightDataEntity.class);
		AirlineDataEntity airlineDataEntity = new AirlineDataEntity(flightScheduleDto.getFlihgtData().getAirlineId());
		flightDataEntity = flightDataRepo.save(flightDataEntity);
		FlightScheduleEntity flightScheduleEntity = modelMapper.map(flightScheduleDto.getScheduleData(),
				FlightScheduleEntity.class);
		flightScheduleEntity = flightScheduleRepo.save(flightScheduleEntity);
		FlightSeatPriceEntity flightSeatPriceEntity = modelMapper.map(flightScheduleDto.getSeatPrice(),
				FlightSeatPriceEntity.class);
		flightSeatPriceEntity = flightSeatPriceRepo.save(flightSeatPriceEntity);
		FlightInfoScheduleDto resultDto = new FlightInfoScheduleDto();
		FlightDataDto tempFlightDataDto = modelMapper.map(flightDataEntity, FlightDataDto.class);
		resultDto.setFlihgtData(tempFlightDataDto);
		FlightScheduleDto flightScheduleEntityTemp = modelMapper.map(flightScheduleEntity, FlightScheduleDto.class);
		resultDto.setScheduleData(flightScheduleEntityTemp);
		FlightSeatPriceDto tempSeatPrice = modelMapper.map(flightSeatPriceEntity, FlightSeatPriceDto.class);
		resultDto.setSeatPrice(tempSeatPrice);
		return resultDto;

	}
}

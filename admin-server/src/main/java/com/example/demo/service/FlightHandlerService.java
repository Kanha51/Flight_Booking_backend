package com.example.demo.service;

import com.example.demo.dto.AirlineDataDto;
import com.example.demo.dto.FlightInfoScheduleDto;

/**
 * The Interface FlightHandlerService.
 */
public interface FlightHandlerService {

	/**
	 * Adds the airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the airline data dto
	 */
	AirlineDataDto addAirline(AirlineDataDto airlineDataDto);

	/**
	 * Block airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the airline data dto
	 */
	AirlineDataDto blockAirline(AirlineDataDto airlineDataDto);

	/**
	 * Flight schedule.
	 *
	 * @param flightScheduleDto the flight schedule dto
	 * @return the flight info schedule dto
	 */
	FlightInfoScheduleDto flightSchedule(FlightInfoScheduleDto flightScheduleDto);

}

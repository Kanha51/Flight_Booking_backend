package com.example.adminserver.service;

import java.util.List;

import com.example.adminserver.dto.AirlineBlockRequestModel;
import com.example.adminserver.dto.AirlineDataRequestDto;
import com.example.adminserver.dto.AirlineDataResponseDto;
import com.example.adminserver.dto.FlightScheduleRequestDto;
import com.example.adminserver.dto.FlightSearchDto;
import com.example.adminserver.dto.FlightSearchResultDto;
import com.example.adminserver.dto.TicketUpdateDto;

/**
 * The Interface FlightHandlerService.
 */
public interface FlightHandlerService {

	/**
	 * Gets the airlinre data.
	 *
	 * @return the airlinre data
	 */
	List<AirlineDataRequestDto> getAirlinreData();

	/**
	 * Adds the airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the airline data dto
	 */
	AirlineDataRequestDto addAirline(AirlineDataRequestDto airlineDataDto);

	/**
	 * Block airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the airline data dto
	 */
	AirlineDataResponseDto blockAirline(AirlineBlockRequestModel airlineDataDto);

	/**
	 * Flight schedule.
	 *
	 * @param flightScheduleDto the flight schedule dto
	 * @return the flight info schedule dto
	 */
	FlightScheduleRequestDto flightSchedule(FlightScheduleRequestDto flightScheduleDto);

	/**
	 * Gets the all flight data.
	 *
	 * @return the all flight data
	 */
	List<FlightScheduleRequestDto> getAllFlightData();

	/**
	 * Search flights.
	 *
	 * @param dto the dto
	 * @return the list
	 */
	List<FlightSearchResultDto> searchFlights(FlightSearchDto dto);

	/**
	 * Ticket update.
	 *
	 * @param dto the dto
	 * @return the ticket update dto
	 */
	TicketUpdateDto ticketUpdate(TicketUpdateDto dto);
}

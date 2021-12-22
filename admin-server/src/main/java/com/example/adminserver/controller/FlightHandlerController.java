package com.example.adminserver.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminserver.dto.AirlineBlockRequestModel;
import com.example.adminserver.dto.AirlineDataRequestDto;
import com.example.adminserver.dto.AirlineDataResponseDto;
import com.example.adminserver.dto.FlightScheduleRequestDto;
import com.example.adminserver.dto.FlightSearchDto;
import com.example.adminserver.dto.FlightSearchResultDto;
import com.example.adminserver.dto.TicketUpdateDto;
import com.example.adminserver.service.FlightHandlerService;
import com.example.adminserver.util.AdminConstant;

/**
 * The Class FlightHandlerController.
 */
@RestController
@RequestMapping(AdminConstant.URL_ADMIN_AIRLINE)
@CrossOrigin(origins = "http://localhost:3000")
public class FlightHandlerController {

	/**
	 * The service.
	 */

	private final FlightHandlerService service;

	/**
	 * Instantiates a new flight handler controller.
	 *
	 * @param service the service
	 */
	public FlightHandlerController(FlightHandlerService service) {
		this.service = service;
	}

	/**
	 * Register airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the response entity
	 */
	@PostMapping(AdminConstant.URL_CREATE_AIRLINE)
	public ResponseEntity<AirlineDataRequestDto> registerAirline(@RequestBody AirlineDataRequestDto airlineDataDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addAirline(airlineDataDto));
	}

	/**
	 * Block airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the response entity
	 */
	@PostMapping(AdminConstant.URL_AIRLINE_BLOCK)
	public ResponseEntity<AirlineDataResponseDto> blockAirline(@RequestBody AirlineBlockRequestModel airlineDataDto) {
		return ResponseEntity.status(HttpStatus.OK).body(service.blockAirline(airlineDataDto));
	}

	/**
	 * Airine scheduler.
	 *
	 * @param flightDto the flight dto
	 * @return the response entity
	 */
	@PostMapping(AdminConstant.URL_AIRLINE_INVENTORY_ADD)
	public ResponseEntity<FlightScheduleRequestDto> airineScheduler(@RequestBody FlightScheduleRequestDto flightDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.flightSchedule(flightDto));
	}

	/**
	 * Gets the airline data.
	 *
	 * @return the airline data
	 */
	@GetMapping(AdminConstant.URL_AIRLINE_DATA)
	public ResponseEntity<List<AirlineDataRequestDto>> getAirlineData() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAirlinreData());
	}

	/**
	 * Gets the flight data.
	 *
	 * @return the flight data
	 */
	@GetMapping(AdminConstant.URL_FLIGHT_DATA)
	public ResponseEntity<List<FlightScheduleRequestDto>> getFlightData() {
		return ResponseEntity.status(HttpStatus.OK).body(service.getAllFlightData());
	}

	/**
	 * Search flights.
	 *
	 * @param dto the dto
	 * @return the response entity
	 */
	@PostMapping(AdminConstant.URL_SEARCH_FLIGHT)
	public ResponseEntity<List<FlightSearchResultDto>> searchFlights(@RequestBody FlightSearchDto dto) {
		return ResponseEntity.ok(service.searchFlights(dto));
	}

	/**
	 * Ticket update.
	 *
	 * @param dto the dto
	 * @return the response entity
	 */
	@PostMapping(AdminConstant.URL_TICKET_UPDATE)
	public ResponseEntity<TicketUpdateDto> ticketUpdate(@RequestBody TicketUpdateDto dto) {
		return ResponseEntity.ok(service.ticketUpdate(dto));
	}
}

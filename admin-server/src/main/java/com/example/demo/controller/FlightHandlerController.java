package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AirlineDataDto;
import com.example.demo.dto.FlightInfoScheduleDto;
import com.example.demo.service.FlightHandlerService;

/**
 * The Class FlightHandlerController.
 */
@RestController
@RequestMapping("/api/v1.0/flight/airline")
public class FlightHandlerController {

	/** The service. */
	@Autowired
	private FlightHandlerService service;

	/**
	 * Register airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the response entity
	 */
	@PostMapping("/register")
	public ResponseEntity<AirlineDataDto> registerAirline(@RequestBody AirlineDataDto airlineDataDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.addAirline(airlineDataDto));
	}

	/**
	 * Block airline.
	 *
	 * @param airlineDataDto the airline data dto
	 * @return the response entity
	 */
	@PostMapping("/block")
	public ResponseEntity<AirlineDataDto> blockAirline(@RequestBody AirlineDataDto airlineDataDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.blockAirline(airlineDataDto));
	}

	/**
	 * Airine scheduler.
	 *
	 * @param flightDto the flight dto
	 * @return the response entity
	 */
	@PostMapping("/inventory/add")
	public ResponseEntity<FlightInfoScheduleDto> airineScheduler(@RequestBody FlightInfoScheduleDto flightDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.flightSchedule(flightDto));
	}
}

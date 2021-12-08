package com.example.adminserver.controller;

import com.example.adminserver.dto.*;
import com.example.adminserver.service.FlightHandlerService;
import com.example.adminserver.util.AdminConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The Class FlightHandlerController.
 */
@RestController
@RequestMapping(AdminConstant.URL_ADMIN_AIRLINE)
public class FlightHandlerController {

    /**
     * The service.
     */
    @Autowired
    private FlightHandlerService service;

    /**
     * Register airline.
     *
     * @param airlineDataDto the airline data dto
     * @return the response entity
     */
    @PostMapping(AdminConstant.URL_CREATE_AIRLINE)
    public ResponseEntity<AirlineDataResponseDto> registerAirline(@RequestBody AirlineDataRequestDto airlineDataDto) {
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
    public ResponseEntity<FlightScheduleResponseDto> airineScheduler(@RequestBody FlightScheduleRequestDto flightDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.flightSchedule(flightDto));
    }

    @GetMapping(AdminConstant.URL_AIRLINE_DATA)
    public ResponseEntity<AirlineDataDtoList> getAirlineData() {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.getAirlinreData());
    }
}

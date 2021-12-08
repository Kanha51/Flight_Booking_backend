package com.example.adminserver.service;


import com.example.adminserver.dto.*;

/**
 * The Interface FlightHandlerService.
 */
public interface FlightHandlerService {

    AirlineDataDtoList getAirlinreData();

    /**
     * Adds the airline.
     *
     * @param airlineDataDto the airline data dto
     * @return the airline data dto
     */
    AirlineDataResponseDto addAirline(AirlineDataRequestDto airlineDataDto);

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
    FlightScheduleResponseDto flightSchedule(FlightScheduleRequestDto flightScheduleDto);
}

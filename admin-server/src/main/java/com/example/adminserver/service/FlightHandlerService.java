package com.example.adminserver.service;


import com.example.adminserver.dto.*;

import java.util.List;

/**
 * The Interface FlightHandlerService.
 */
public interface FlightHandlerService {

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

    List<FlightScheduleRequestDto> getAllFlightData();


    List<FlightSearchResultDto> searchFlights(FlightSearchDto dto);

    TicketUpdateDto ticketUpdate(TicketUpdateDto dto);
}

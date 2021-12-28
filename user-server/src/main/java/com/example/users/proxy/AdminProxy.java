package com.example.users.proxy;

import com.example.users.dto.FlightSearchDto;
import com.example.users.dto.FlightSearchResultDto;
import com.example.users.dto.TicketUpdateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * The Interface AdminProxy.
 */
@FeignClient(value = "AIRLINESCHEDULE-WS")
public interface AdminProxy {

    /**
     * Search flights.
     *
     * @param dto the dto
     * @return the list
     */
    @GetMapping("/api/v1.0/flight/airline/search")
    List<FlightSearchResultDto> searchFlights(@RequestBody FlightSearchDto dto);

    /**
     * Ticket update.
     *
     * @param dto the dto
     * @return the ticket update dto
     */
    @PostMapping("/api/v1.0/flight/airline/ticketUpdate")
    TicketUpdateDto ticketUpdate(@RequestBody TicketUpdateDto dto);
}
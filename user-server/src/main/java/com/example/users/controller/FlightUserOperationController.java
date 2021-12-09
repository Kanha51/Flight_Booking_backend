package com.example.users.controller;

import com.example.users.dto.*;
import com.example.users.entity.FlightBookingDetailEntity;
import com.example.users.service.UserServiceImpl;
import com.example.users.util.UserConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Flight user operation controller.
 */
@RestController
@RequestMapping(UserConstant.URL_ADMIN)
public class FlightUserOperationController {

    /**
     * The Service.
     */
    @Autowired
    private UserServiceImpl service;


    @PostMapping(UserConstant.URL_BOOK_TICKET)
    public ResponseEntity<PnrDto> bookTicket(
            @RequestBody FlightBookingDto bookingDetail) {
        return ResponseEntity.ok(service.bookTicket(bookingDetail));
    }

    /**
     * Book ticket response entity.
     *
     * @param pnrNo the pnr no
     * @return the response entity
     */
    @DeleteMapping(UserConstant.URL_CANCEL_TICKET)
    public ResponseEntity<UserFlightStatusDto> bookTicket(@PathVariable("pnrNo") String pnrNo) {
        return ResponseEntity.ok(service.cancelTicket(pnrNo));
    }

    /**
     * Search flight details by email list.
     *
     * @param emailId the email id
     * @return the list
     */
    @GetMapping(UserConstant.URL_SEARCHED_BY_EMAIL_ID)
    public List<FlightBookingDetailEntity> searchFlightDetailsByEmail(@PathVariable("emailId") String emailId) {
        return service.searchFlightDetailsByEmailOrPnr(emailId);
    }


    @PostMapping(UserConstant.URL_FLIGHT_HISTORY)
    public ResponseEntity<List<FlightHistoryDto>> searchFlight(@RequestBody FlightHistoryRequestDto dto) {
        return ResponseEntity.ok(service.getFlightHistory(dto));
    }
}

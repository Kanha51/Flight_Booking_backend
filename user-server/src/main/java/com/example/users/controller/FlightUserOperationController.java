package com.example.users.controller;

import com.example.users.dto.*;
import com.example.users.proxy.AdminProxy;
import com.example.users.service.UserServiceImpl;
import com.example.users.util.UserConstant;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Flight user operation controller.
 */
@RestController
@RequestMapping(UserConstant.URL_ADMIN)
@CrossOrigin(origins = "*")
public class FlightUserOperationController {
    private static final Logger logger = LoggerFactory.getLogger(FlightUserOperationController.class);
    /**
     * The Service.
     */

    private final UserServiceImpl service;

    /**
     * The admin proxy.
     */
    private final AdminProxy adminProxy;

    /**
     * Instantiates a new flight user operation controller.
     *
     * @param service    the service
     * @param adminProxy the admin proxy
     */
    public FlightUserOperationController(UserServiceImpl service, AdminProxy adminProxy) {
        this.service = service;
        this.adminProxy = adminProxy;
    }

    /**
     * Book ticket.
     *
     * @param bookingDetail the booking detail
     * @return the response entity
     */
    @PostMapping(UserConstant.URL_BOOK_TICKET)
    public ResponseEntity<PnrDto> bookTicket(@RequestBody FlightBookingDto bookingDetail) {
        logger.info("request : " + bookingDetail);
        PnrDto result = service.bookTicket(bookingDetail);
        logger.info("result : " + result);
        return ResponseEntity.ok(result);
    }

    /**
     * Cancel ticket.
     *
     * @param dto the dto
     * @return the response entity
     */
    @PostMapping(UserConstant.URL_CANCEL_TICKET)
    public ResponseEntity<UserFlightStatusDto> cancelTicket(@RequestBody PnrDto dto) {
        logger.info("request : " + dto);
        UserFlightStatusDto result = service.cancelTicket(dto.getPnrNo());
        logger.info("response : " + result);
        return ResponseEntity.ok(result);
    }

    /**
     * Search flight details by email list.
     *
     * @param emailId the email id
     * @return the list
     */


    /**
     * Search flight.
     *
     * @param dto the dto
     * @return the response entity
     */
    @PostMapping(UserConstant.URL_FLIGHT_HISTORY)
    public ResponseEntity<List<FlightHistoryDto>> searchFlight(@RequestBody FlightHistoryRequestDto dto) {
        return ResponseEntity.ok(service.getFlightHistory(dto));
    }

    /**
     * Search flights.
     *
     * @param dto the dto
     * @return the response entity
     */
    @PostMapping(UserConstant.URL_SEARCH_FLIGHT)
    @CircuitBreaker(name = "myCircuitBreaker", fallbackMethod = "myTestFallBack")
    public ResponseEntity<List<FlightSearchResultDto>> searchFlights(@RequestBody FlightSearchDto dto) {
        return ResponseEntity.ok(adminProxy.searchFlights(dto));
    }

    /**
     * My test fall back.
     *
     * @param e the e
     * @return the response entity
     */
    public ResponseEntity<?> myTestFallBack(Exception e) {
        return ResponseEntity.ok("within myTestFallBack method. User-WS is down" + e.toString());
    }

    /**
     * Sign up.
     *
     * @param dto the dto
     * @return the response entity
     */
    @PostMapping(UserConstant.URL_USER_SIGNUP)
    public ResponseEntity<UserSignUpResponseDto> signUp(@RequestBody UserSignUpDto dto) {
        return ResponseEntity.ok(service.userSignUp(dto));
    }
}

package com.example.users.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.dto.FlightBookingDto;
import com.example.users.dto.FlightHistoryDto;
import com.example.users.dto.FlightHistoryRequestDto;
import com.example.users.dto.FlightSearchDto;
import com.example.users.dto.FlightSearchResultDto;
import com.example.users.dto.PnrDto;
import com.example.users.dto.UserFlightStatusDto;
import com.example.users.dto.UserSignUpDto;
import com.example.users.dto.UserSignUpResponseDto;
import com.example.users.entity.FlightBookingDetailEntity;
import com.example.users.proxy.AdminProxy;
import com.example.users.service.UserServiceImpl;
import com.example.users.util.UserConstant;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

/**
 * The type Flight user operation controller.
 */
@RestController
@RequestMapping(UserConstant.URL_ADMIN)
@CrossOrigin(origins = "*")
public class FlightUserOperationController {

	/**
	 * The Service.
	 */

	private final UserServiceImpl service;

	/** The admin proxy. */
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
		return ResponseEntity.ok(service.bookTicket(bookingDetail));
	}

	/**
	 * Cancel ticket.
	 *
	 * @param dto the dto
	 * @return the response entity
	 */
	@PostMapping(UserConstant.URL_CANCEL_TICKET)
	public ResponseEntity<UserFlightStatusDto> cancelTicket(@RequestBody PnrDto dto) {
		return ResponseEntity.ok(service.cancelTicket(dto.getPnrNo()));
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

package com.flightapp.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.users.dto.FlightBookingDto;
import com.flightapp.users.dto.FlightSearchDto;
import com.flightapp.users.dto.FlightSearchResultDto;
import com.flightapp.users.dto.PnrDto;
import com.flightapp.users.dto.UserFlightStatusDto;
import com.flightapp.users.entity.FlightBookingDetailEntity;
import com.flightapp.users.service.FlightUserOperationService;
import com.flightapp.users.util.UserConstant;

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
	private FlightUserOperationService service;

	/**
	 * Book ticket response entity.
	 *
	 * @param flightId      the flight id
	 * @param bookingDetail the booking detail
	 * @return the response entity
	 */
	@PostMapping(UserConstant.URL_BOOK_TICKET)
	public ResponseEntity<PnrDto> bookTicket(
			@RequestBody FlightBookingDto bookingDetail) {
		return ResponseEntity.ok(service.bookTicket( bookingDetail));
	}

	/**
	 * Book ticket response entity.
	 *
	 * @param pnrNo the pnr no
	 * @return the response entity
	 */
	@DeleteMapping(UserConstant.URL_CANCEL_TICKET)
	public ResponseEntity<UserFlightStatusDto> bookTicket(@PathVariable("pnrNo")  String pnrNo) {
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

	
	/**
	 * Search flight response entity.
	 *
	 * @param searchParam the search param
	 * @return the response entity
	 */
	@PostMapping(UserConstant.URL_SEARCH_FLIGHT)
	public ResponseEntity<List<FlightSearchResultDto>> searchFlight(@RequestBody FlightSearchDto searchParam) {
		return ResponseEntity.ok(service.serchFlightByParam(searchParam));
	}
}

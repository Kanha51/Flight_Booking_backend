package com.example.users.service;

import java.util.List;

import com.example.users.dto.FlightBookingDto;
import com.example.users.dto.FlightHistoryDto;
import com.example.users.dto.FlightHistoryRequestDto;
import com.example.users.dto.PnrDto;
import com.example.users.dto.UserFlightStatusDto;
import com.example.users.dto.UserSignUpDto;
import com.example.users.dto.UserSignUpResponseDto;

/**
 * The Interface UserService.
 */
public interface UserService {

	/**
	 * Book ticket.
	 *
	 * @param bookingDetail the booking detail
	 * @return the pnr dto
	 */
	PnrDto bookTicket(FlightBookingDto bookingDetail);

	/**
	 * Cancel ticket.
	 *
	 * @param pnrNo the pnr no
	 * @return the user flight status dto
	 */
	UserFlightStatusDto cancelTicket(String pnrNo);

	/**
	 * Gets the flight history.
	 *
	 * @param dto the dto
	 * @return the flight history
	 */
	List<FlightHistoryDto> getFlightHistory(FlightHistoryRequestDto dto);

	/**
	 * User sign up.
	 *
	 * @param dto the dto
	 * @return the user sign up response dto
	 */
	UserSignUpResponseDto userSignUp(UserSignUpDto dto);
}

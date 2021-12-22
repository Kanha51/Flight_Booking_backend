package com.example.users.dto;

/**
 * The Class TicketUpdateDto.
 */
public class TicketUpdateDto {

	/** The flight no. */
	private String flightNo;

	/** The add ticket. */
	private int addTicket;

	/** The cancel ticket. */
	private int cancelTicket;

	/** The seat type. */
	private int seatType;

	/**
	 * Gets the flight no.
	 *
	 * @return the flight no
	 */
	public String getFlightNo() {
		return flightNo;
	}

	/**
	 * Sets the flight no.
	 *
	 * @param flightNo the new flight no
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	/**
	 * Gets the adds the ticket.
	 *
	 * @return the adds the ticket
	 */
	public int getAddTicket() {
		return addTicket;
	}

	/**
	 * Sets the adds the ticket.
	 *
	 * @param addTicket the new adds the ticket
	 */
	public void setAddTicket(int addTicket) {
		this.addTicket = addTicket;
	}

	/**
	 * Gets the cancel ticket.
	 *
	 * @return the cancel ticket
	 */
	public int getCancelTicket() {
		return cancelTicket;
	}

	/**
	 * Sets the cancel ticket.
	 *
	 * @param cancelTicket the new cancel ticket
	 */
	public void setCancelTicket(int cancelTicket) {
		this.cancelTicket = cancelTicket;
	}

	/**
	 * Gets the seat type.
	 *
	 * @return the seat type
	 */
	public int getSeatType() {
		return seatType;
	}

	/**
	 * Sets the seat type.
	 *
	 * @param seatType the new seat type
	 */
	public void setSeatType(int seatType) {
		this.seatType = seatType;
	}
}

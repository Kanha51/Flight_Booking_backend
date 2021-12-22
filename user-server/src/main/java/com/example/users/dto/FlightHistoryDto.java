package com.example.users.dto;

import java.util.Date;

/**
 * The Class FlightHistoryDto.
 */
public class FlightHistoryDto {

	/** The airline name. */
	private String airlineName;
	/**
	 * The Flight no.
	 */
	private String flightNo;

	/** The can cancel. */
	private int canCancel;
	/**
	 * The Date time.
	 */
	private java.sql.Date dateTime;
	/**
	 * The Flight from.
	 */
	private String flightFrom;
	/**
	 * The Flight to.
	 */
	private String flightTo;
	/**
	 * The Customer name.
	 */
	private String customerName;

	/** The seat type. */
	private String seatType;

	/** The pnr no. */
	private String pnrNo;

	/** The take off time. */
	private Date takeOffTime;

	/** The landing time. */
	private Date landingTime;

	/** The price. */
	private Double price;

	/** The cancel ticket. */
	private int cancelTicket;

	/**
	 * Gets the airline name.
	 *
	 * @return the airline name
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * Sets the airline name.
	 *
	 * @param airlineName the new airline name
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

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
	 * Gets the date time.
	 *
	 * @return the date time
	 */
	public java.sql.Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the date time.
	 *
	 * @param dateTime the new date time
	 */
	public void setDateTime(java.sql.Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Gets the flight from.
	 *
	 * @return the flight from
	 */
	public String getFlightFrom() {
		return flightFrom;
	}

	/**
	 * Sets the flight from.
	 *
	 * @param flightFrom the new flight from
	 */
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}

	/**
	 * Gets the flight to.
	 *
	 * @return the flight to
	 */
	public String getFlightTo() {
		return flightTo;
	}

	/**
	 * Sets the flight to.
	 *
	 * @param flightTo the new flight to
	 */
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}

	/**
	 * Gets the customer name.
	 *
	 * @return the customer name
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Sets the customer name.
	 *
	 * @param customerName the new customer name
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Gets the seat type.
	 *
	 * @return the seat type
	 */
	public String getSeatType() {
		return seatType;
	}

	/**
	 * Sets the seat type.
	 *
	 * @param seatType the new seat type
	 */
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	/**
	 * Gets the pnr no.
	 *
	 * @return the pnr no
	 */
	public String getPnrNo() {
		return pnrNo;
	}

	/**
	 * Sets the pnr no.
	 *
	 * @param pnrNo the new pnr no
	 */
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
	}

	/**
	 * Gets the take off time.
	 *
	 * @return the take off time
	 */
	public Date getTakeOffTime() {
		return takeOffTime;
	}

	/**
	 * Sets the take off time.
	 *
	 * @param takeOffTime the new take off time
	 */
	public void setTakeOffTime(Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	/**
	 * Gets the landing time.
	 *
	 * @return the landing time
	 */
	public Date getLandingTime() {
		return landingTime;
	}

	/**
	 * Sets the landing time.
	 *
	 * @param landingTime the new landing time
	 */
	public void setLandingTime(Date landingTime) {
		this.landingTime = landingTime;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(Double price) {
		this.price = price;
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
	 * Gets the can cancel.
	 *
	 * @return the can cancel
	 */
	public int getCanCancel() {
		return canCancel;
	}

	/**
	 * Sets the can cancel.
	 *
	 * @param canCancel the new can cancel
	 */
	public void setCanCancel(int canCancel) {
		this.canCancel = canCancel;
	}
}

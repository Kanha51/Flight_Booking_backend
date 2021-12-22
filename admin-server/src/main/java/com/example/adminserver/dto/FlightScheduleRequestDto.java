package com.example.adminserver.dto;

import java.sql.Date;

/**
 * The Class FlightInfoScheduleDto.
 */
public class FlightScheduleRequestDto {

	/**
	 * The start date.
	 */
	private Date startDate;

	/**
	 * The take off time.
	 */
	private java.util.Date takeOffTime;

	/**
	 * The landing time.
	 */
	private java.util.Date landingTime;

	/**
	 * The business seats.
	 */
	private Long businessSeats;

	/**
	 * The non business seats.
	 */
	private Long nonBusinessSeats;

	/**
	 * The no of rows.
	 */
	private Long noOfRows;

	/**
	 * The discount.
	 */
	private Double discount;

	/**
	 * The tax.
	 */
	private Double tax;

	/**
	 * The other charges.
	 */
	private Double otherCharges;

	/**
	 * The ticket cost.
	 */
	private Double ticketCost;

	/**
	 * The other charge info.
	 */
	private String otherChargeInfo;

	/** The flight no. */
	private String flightNo;

	/**
	 * The to flight.
	 *
	 * @return the start date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the start date.
	 *
	 * @param startDate the new start date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the take off time.
	 *
	 * @return the take off time
	 */
	public java.util.Date getTakeOffTime() {
		return takeOffTime;
	}

	/**
	 * Sets the take off time.
	 *
	 * @param takeOffTime the new take off time
	 */
	public void setTakeOffTime(java.util.Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	/**
	 * Gets the landing time.
	 *
	 * @return the landing time
	 */
	public java.util.Date getLandingTime() {
		return landingTime;
	}

	/**
	 * Sets the landing time.
	 *
	 * @param landingTime the new landing time
	 */
	public void setLandingTime(java.util.Date landingTime) {
		this.landingTime = landingTime;
	}

	/**
	 * Gets the business seats.
	 *
	 * @return the business seats
	 */
	public Long getBusinessSeats() {
		return businessSeats;
	}

	/**
	 * Sets the business seats.
	 *
	 * @param businessSeats the new business seats
	 */
	public void setBusinessSeats(Long businessSeats) {
		this.businessSeats = businessSeats;
	}

	/**
	 * Gets the non business seats.
	 *
	 * @return the non business seats
	 */
	public Long getNonBusinessSeats() {
		return nonBusinessSeats;
	}

	/**
	 * Sets the non business seats.
	 *
	 * @param nonBusinessSeats the new non business seats
	 */
	public void setNonBusinessSeats(Long nonBusinessSeats) {
		this.nonBusinessSeats = nonBusinessSeats;
	}

	/**
	 * Gets the no of rows.
	 *
	 * @return the no of rows
	 */
	public Long getNoOfRows() {
		return noOfRows;
	}

	/**
	 * Sets the no of rows.
	 *
	 * @param noOfRows the new no of rows
	 */
	public void setNoOfRows(Long noOfRows) {
		this.noOfRows = noOfRows;
	}

	/**
	 * Gets the discount.
	 *
	 * @return the discount
	 */
	public Double getDiscount() {
		return discount;
	}

	/**
	 * Sets the discount.
	 *
	 * @param discount the new discount
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	/**
	 * Gets the tax.
	 *
	 * @return the tax
	 */
	public Double getTax() {
		return tax;
	}

	/**
	 * Sets the tax.
	 *
	 * @param tax the new tax
	 */
	public void setTax(Double tax) {
		this.tax = tax;
	}

	/**
	 * Gets the other charges.
	 *
	 * @return the other charges
	 */
	public Double getOtherCharges() {
		return otherCharges;
	}

	/**
	 * Sets the other charges.
	 *
	 * @param otherCharges the new other charges
	 */
	public void setOtherCharges(Double otherCharges) {
		this.otherCharges = otherCharges;
	}

	/**
	 * Gets the ticket cost.
	 *
	 * @return the ticket cost
	 */
	public Double getTicketCost() {
		return ticketCost;
	}

	/**
	 * Sets the ticket cost.
	 *
	 * @param ticketCost the new ticket cost
	 */
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	/**
	 * Gets the other charge info.
	 *
	 * @return the other charge info
	 */
	public String getOtherChargeInfo() {
		return otherChargeInfo;
	}

	/**
	 * Sets the other charge info.
	 *
	 * @param otherChargeInfo the new other charge info
	 */
	public void setOtherChargeInfo(String otherChargeInfo) {
		this.otherChargeInfo = otherChargeInfo;
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
}
package com.example.adminserver.dto;

import java.io.Serializable;
import java.sql.Date;

/**
 * The type Flight search result dto.
 */
public class FlightSearchResultDto implements Serializable {

	/**
	 * The constant serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/** The airline name. */
	private String airlineName;

	/**
	 * The contact no.
	 */
	private Long contactNo;

	/**
	 * The airline address.
	 */
	private String airlineAddress;



	/**
	 * The meals.
	 */
	private String meals;

	/**
	 * The instrument.
	 */
	private String instrument;

	/**
	 * The from flight.
	 */
	private String fromFlight;

	/** The from flight code. */
	private String fromFlightCode;

	/**
	 * The to flight.
	 */
	private String toFlight;

	/** The flight no. */
	private String flightNo;

	/** The to flight code. */
	private String toFlightCode;

	/** The cost. */
	public Double cost;

	/** The flight date. */
	public Date flightDate;

	/** The take off time. */
	private java.util.Date takeOffTime;

	/** The landing time. */
	private java.util.Date landingTime;

	private Long businessSeats;

	private Long nonBusinesSeats;

	private Double tax;

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAirlineAddress() {
		return airlineAddress;
	}

	public void setAirlineAddress(String airlineAddress) {
		this.airlineAddress = airlineAddress;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getFromFlight() {
		return fromFlight;
	}

	public void setFromFlight(String fromFlight) {
		this.fromFlight = fromFlight;
	}

	public String getFromFlightCode() {
		return fromFlightCode;
	}

	public void setFromFlightCode(String fromFlightCode) {
		this.fromFlightCode = fromFlightCode;
	}

	public String getToFlight() {
		return toFlight;
	}

	public void setToFlight(String toFlight) {
		this.toFlight = toFlight;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getToFlightCode() {
		return toFlightCode;
	}

	public void setToFlightCode(String toFlightCode) {
		this.toFlightCode = toFlightCode;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public java.util.Date getTakeOffTime() {
		return takeOffTime;
	}

	public void setTakeOffTime(java.util.Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	public java.util.Date getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(java.util.Date landingTime) {
		this.landingTime = landingTime;
	}

	public Long getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(Long businessSeats) {
		this.businessSeats = businessSeats;
	}

	public Long getNonBusinesSeats() {
		return nonBusinesSeats;
	}

	public void setNonBusinesSeats(Long nonBusinesSeats) {
		this.nonBusinesSeats = nonBusinesSeats;
	}
}

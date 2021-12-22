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
	 * The daily.
	 */
	private Integer daily;

	/**
	 * The week days.
	 */
	private Integer weekDays;

	/**
	 * The week ends.
	 */
	private Integer weekEnds;

	/**
	 * The specific days.
	 */
	private Integer specificDays;

	/**
	 * The specific days list.
	 */
	private String specificDaysList;

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

	private String fromFlightCode;

	/**
	 * The to flight.
	 */
	private String toFlight;

	private String flightNo;

	private String toFlightCode;

	public Double cost;

	public Date flightDate;

	private java.util.Date takeOffTime;

	private java.util.Date landingTime;

	public static long getSerialVersionUID() {
		return serialVersionUID;
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

	public Integer getDaily() {
		return daily;
	}

	public void setDaily(Integer daily) {
		this.daily = daily;
	}

	public Integer getWeekDays() {
		return weekDays;
	}

	public void setWeekDays(Integer weekDays) {
		this.weekDays = weekDays;
	}

	public Integer getWeekEnds() {
		return weekEnds;
	}

	public void setWeekEnds(Integer weekEnds) {
		this.weekEnds = weekEnds;
	}

	public Integer getSpecificDays() {
		return specificDays;
	}

	public void setSpecificDays(Integer specificDays) {
		this.specificDays = specificDays;
	}

	public String getSpecificDaysList() {
		return specificDaysList;
	}

	public void setSpecificDaysList(String specificDaysList) {
		this.specificDaysList = specificDaysList;
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
}

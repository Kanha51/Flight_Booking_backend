package com.example.users.dto;

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

	/**
	 * Gets the serial version UID.
	 *
	 * @return the serial version UID
	 */
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

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
	 * Gets the contact no.
	 *
	 * @return the contact no
	 */
	public Long getContactNo() {
		return contactNo;
	}

	/**
	 * Sets the contact no.
	 *
	 * @param contactNo the new contact no
	 */
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * Gets the airline address.
	 *
	 * @return the airline address
	 */
	public String getAirlineAddress() {
		return airlineAddress;
	}

	/**
	 * Sets the airline address.
	 *
	 * @param airlineAddress the new airline address
	 */
	public void setAirlineAddress(String airlineAddress) {
		this.airlineAddress = airlineAddress;
	}

	/**
	 * Gets the daily.
	 *
	 * @return the daily
	 */
	public Integer getDaily() {
		return daily;
	}

	/**
	 * Sets the daily.
	 *
	 * @param daily the new daily
	 */
	public void setDaily(Integer daily) {
		this.daily = daily;
	}

	/**
	 * Gets the week days.
	 *
	 * @return the week days
	 */
	public Integer getWeekDays() {
		return weekDays;
	}

	/**
	 * Sets the week days.
	 *
	 * @param weekDays the new week days
	 */
	public void setWeekDays(Integer weekDays) {
		this.weekDays = weekDays;
	}

	/**
	 * Gets the week ends.
	 *
	 * @return the week ends
	 */
	public Integer getWeekEnds() {
		return weekEnds;
	}

	/**
	 * Sets the week ends.
	 *
	 * @param weekEnds the new week ends
	 */
	public void setWeekEnds(Integer weekEnds) {
		this.weekEnds = weekEnds;
	}

	/**
	 * Gets the specific days.
	 *
	 * @return the specific days
	 */
	public Integer getSpecificDays() {
		return specificDays;
	}

	/**
	 * Sets the specific days.
	 *
	 * @param specificDays the new specific days
	 */
	public void setSpecificDays(Integer specificDays) {
		this.specificDays = specificDays;
	}

	/**
	 * Gets the specific days list.
	 *
	 * @return the specific days list
	 */
	public String getSpecificDaysList() {
		return specificDaysList;
	}

	/**
	 * Sets the specific days list.
	 *
	 * @param specificDaysList the new specific days list
	 */
	public void setSpecificDaysList(String specificDaysList) {
		this.specificDaysList = specificDaysList;
	}

	/**
	 * Gets the meals.
	 *
	 * @return the meals
	 */
	public String getMeals() {
		return meals;
	}

	/**
	 * Sets the meals.
	 *
	 * @param meals the new meals
	 */
	public void setMeals(String meals) {
		this.meals = meals;
	}

	/**
	 * Gets the instrument.
	 *
	 * @return the instrument
	 */
	public String getInstrument() {
		return instrument;
	}

	/**
	 * Sets the instrument.
	 *
	 * @param instrument the new instrument
	 */
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	/**
	 * Gets the from flight.
	 *
	 * @return the from flight
	 */
	public String getFromFlight() {
		return fromFlight;
	}

	/**
	 * Sets the from flight.
	 *
	 * @param fromFlight the new from flight
	 */
	public void setFromFlight(String fromFlight) {
		this.fromFlight = fromFlight;
	}

	/**
	 * Gets the from flight code.
	 *
	 * @return the from flight code
	 */
	public String getFromFlightCode() {
		return fromFlightCode;
	}

	/**
	 * Sets the from flight code.
	 *
	 * @param fromFlightCode the new from flight code
	 */
	public void setFromFlightCode(String fromFlightCode) {
		this.fromFlightCode = fromFlightCode;
	}

	/**
	 * Gets the to flight.
	 *
	 * @return the to flight
	 */
	public String getToFlight() {
		return toFlight;
	}

	/**
	 * Sets the to flight.
	 *
	 * @param toFlight the new to flight
	 */
	public void setToFlight(String toFlight) {
		this.toFlight = toFlight;
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
	 * Gets the to flight code.
	 *
	 * @return the to flight code
	 */
	public String getToFlightCode() {
		return toFlightCode;
	}

	/**
	 * Sets the to flight code.
	 *
	 * @param toFlightCode the new to flight code
	 */
	public void setToFlightCode(String toFlightCode) {
		this.toFlightCode = toFlightCode;
	}

	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * Sets the cost.
	 *
	 * @param cost the new cost
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

	/**
	 * Gets the flight date.
	 *
	 * @return the flight date
	 */
	public Date getFlightDate() {
		return flightDate;
	}

	/**
	 * Sets the flight date.
	 *
	 * @param flightDate the new flight date
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
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
}

package com.example.adminserver.dto;

import java.sql.Date;

/**
 * The Class AirlineDataRequestDto.
 */
public class AirlineDataRequestDto {

	/**
	 * The airline name.
	 */
	private String airlineName;

	/** The airline address. */
	private String airlineAddress;

	/**
	 * The logo.
	 */
	private Byte logo;

	/**
	 * The contact no.
	 */
	private Long contactNo;

	/** The start date. */
	private Date startDate;
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

	/**
	 * The airline address.
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
	 * Gets the logo.
	 *
	 * @return the logo
	 */
	public Byte getLogo() {
		return logo;
	}

	/**
	 * Sets the logo.
	 *
	 * @param logo the new logo
	 */
	public void setLogo(Byte logo) {
		this.logo = logo;
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
	 * Gets the start date.
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
}

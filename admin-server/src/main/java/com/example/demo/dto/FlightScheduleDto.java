package com.example.demo.dto;

import java.sql.Timestamp;
import java.util.Date;

/**
 * The Class FlightScheduleDto.
 */
public class FlightScheduleDto {

	/** The airline id. */
	private Long airlineId;

	/** The flight id. */
	private Long flightId;

	/** The flight no. */
	private String flightNo;

	/** The start date. */
	private Date startDate;

	/** The end date. */
	private Date endDate;

	/** The take off time. */
	private Timestamp takeOffTime;

	/** The landing time. */
	private Timestamp landingTime;

	/** The daily. */
	private Integer daily;

	/** The week days. */
	private Integer weekDays;

	/** The week ends. */
	private Integer weekEnds;

	/** The specific days. */
	private Integer specificDays;

	/** The specific days list. */
	private String specificDaysList;

	/**
	 * Gets the airline id.
	 *
	 * @return the airline id
	 */
	public Long getAirlineId() {
		return airlineId;
	}

	/**
	 * Sets the airline id.
	 *
	 * @param airlineId the new airline id
	 */
	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}

	/**
	 * Gets the flight id.
	 *
	 * @return the flight id
	 */
	public Long getFlightId() {
		return flightId;
	}

	/**
	 * Sets the flight id.
	 *
	 * @param flightId the new flight id
	 */
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
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

	/**
	 * Gets the end date.
	 *
	 * @return the end date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the end date.
	 *
	 * @param endDate the new end date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Gets the take off time.
	 *
	 * @return the take off time
	 */
	public Timestamp getTakeOffTime() {
		return takeOffTime;
	}

	/**
	 * Sets the take off time.
	 *
	 * @param takeOffTime the new take off time
	 */
	public void setTakeOffTime(Timestamp takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	/**
	 * Gets the landing time.
	 *
	 * @return the landing time
	 */
	public Timestamp getLandingTime() {
		return landingTime;
	}

	/**
	 * Sets the landing time.
	 *
	 * @param landingTime the new landing time
	 */
	public void setLandingTime(Timestamp landingTime) {
		this.landingTime = landingTime;
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

}

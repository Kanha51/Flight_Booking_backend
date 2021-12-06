package com.example.demo.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * The Class FlightScheduleEntity.
 */
@Entity
@Table(name = "Flight_Schedule_Entity")
@Data
public class FlightScheduleEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long airlineId;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public Long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Timestamp getTakeOffTime() {
		return takeOffTime;
	}

	public void setTakeOffTime(Timestamp takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	public Timestamp getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(Timestamp landingTime) {
		this.landingTime = landingTime;
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

}

package com.example.demo.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	/** The airline id. */
	@JoinColumn(name = "airlineId", referencedColumnName = "id")
	private AirlineDataEntity airlineId;

	/** The flight id. */
	@JoinColumn(name = "flightId", referencedColumnName = "id")
	private FlightDataEntity flightId;

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

}

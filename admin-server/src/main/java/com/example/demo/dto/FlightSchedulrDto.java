package com.example.demo.dto;

import java.sql.Timestamp;
import java.util.Date;

public class FlightSchedulrDto {

	private Long airlineId;

	private Long flightId;

	private String flightNo;

	private Date startDate;

	private Date endDate;

	private Timestamp takeOffTime;

	private Timestamp landingTime;

	private Integer daily;

	private Integer weekDays;

	private Integer weekEnds;

	private Integer specificDays;

	private String specificDaysList;
}

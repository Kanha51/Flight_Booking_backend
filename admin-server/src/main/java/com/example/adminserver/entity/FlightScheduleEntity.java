package com.example.adminserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * The Class FlightScheduleEntity.
 */
@Entity
@Table(name = "Flight_Schedule_Entity")
@Data
public class FlightScheduleEntity {

    /**
     * The id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String airlineId;


    /**
     * The flight no.
     */
    private String flightNo;

    /**
     * The start date.
     */
    private Date startDate;

    /**
     * The end date.
     */
    private Date endDate;

    /**
     * The take off time.
     */
    private Date takeOffTime;

    /**
     * The landing time.
     */
    private Date landingTime;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
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

    public Date getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(Date takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public Date getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(Date landingTime) {
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

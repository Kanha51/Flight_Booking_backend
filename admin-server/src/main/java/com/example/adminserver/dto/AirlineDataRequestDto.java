package com.example.adminserver.dto;

import java.sql.Date;

public class AirlineDataRequestDto {

    /**
     * The airline name.
     */
    private String airlineName;

    private String airlineAddress;

    /**
     * The logo.
     */
    private Byte logo;

    /**
     * The contact no.
     */
    private Long contactNo;

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

    private String fromFlightCode;

    /**
     * The to flight.
     */
    private String toFlight;


    private String flightNo;

    private String toFlightCode;

    /**
     * The airline address.
     */

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public Byte getLogo() {
        return logo;
    }

    public void setLogo(Byte logo) {
        this.logo = logo;
    }

    public Long getContactNo() {
        return contactNo;
    }

    public void setContactNo(Long contactNo) {
        this.contactNo = contactNo;
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

    public String getAirlineAddress() {
        return airlineAddress;
    }

    public void setAirlineAddress(String airlineAddress) {
        this.airlineAddress = airlineAddress;
    }

    public String getFromFlightCode() {
        return fromFlightCode;
    }

    public void setFromFlightCode(String fromFlightCode) {
        this.fromFlightCode = fromFlightCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}

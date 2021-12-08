package com.example.adminserver.dto;

import java.util.Date;

/**
 * The Class FlightInfoScheduleDto.
 */
public class FlightScheduleRequestDto {


    /**
     * The airline id.
     */
    private String airlineId;


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


    /**
     * The business seats.
     */
    private Long businessSeats;

    /**
     * The non business seats.
     */
    private Long nonBusinessSeats;

    /**
     * The no of rows.
     */
    private Long noOfRows;

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

    /**
     * The to flight.
     */
    private String toFlight;


    /**
     * The seat type.
     */
    private Long seatType;

    /**
     * The discount.
     */
    private Double discount;

    /**
     * The tax.
     */
    private Double tax;

    /**
     * The other charges.
     */
    private Double otherCharges;

    /**
     * The ticket cost.
     */
    private Double ticketCost;

    /**
     * The other charge info.
     */
    private String otherChargeInfo;

    private String fromFlightCode;

    /**
     * The to flight.
     */
    private String toFlightCode;

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

    public Long getBusinessSeats() {
        return businessSeats;
    }

    public void setBusinessSeats(Long businessSeats) {
        this.businessSeats = businessSeats;
    }

    public Long getNonBusinessSeats() {
        return nonBusinessSeats;
    }

    public void setNonBusinessSeats(Long nonBusinessSeats) {
        this.nonBusinessSeats = nonBusinessSeats;
    }

    public Long getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(Long noOfRows) {
        this.noOfRows = noOfRows;
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

    public Long getSeatType() {
        return seatType;
    }

    public void setSeatType(Long seatType) {
        this.seatType = seatType;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(Double otherCharges) {
        this.otherCharges = otherCharges;
    }

    public Double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(Double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public String getOtherChargeInfo() {
        return otherChargeInfo;
    }

    public void setOtherChargeInfo(String otherChargeInfo) {
        this.otherChargeInfo = otherChargeInfo;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    public String getFromFlightCode() {
        return fromFlightCode;
    }

    public void setFromFlightCode(String fromFlightCode) {
        this.fromFlightCode = fromFlightCode;
    }

    public String getToFlightCode() {
        return toFlightCode;
    }

    public void setToFlightCode(String toFlightCode) {
        this.toFlightCode = toFlightCode;
    }
}
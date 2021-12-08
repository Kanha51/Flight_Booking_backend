package com.example.adminserver.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "Flight_Data")
@Data
public class FlightDataEntity {

    /**
     * The id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * The airline id.
     */
    private String airlineId;

    /**
     * The business seats.
     */
    @Column(unique = true, nullable = false)
    private Long businessSeats;

    /**
     * The non business seats.
     */
    @Column(unique = true, nullable = false)
    private Long nonBusinessSeats;

    /**
     * The no of rows.
     */
    @Column(unique = true, nullable = false)
    private Long noOfRows;

    /**
     * The meals.
     */
    @Column(unique = true, nullable = false)
    private String meals;

    /**
     * The instrument.
     */
    @Column(unique = true, nullable = false)
    private String instrument;

    /**
     * The from flight.
     */
    @Column(unique = true, nullable = false)
    private String fromFlight;

    /**
     * The to flight.
     */
    @Column(unique = true, nullable = false)
    private String toFlight;

    @Column(unique = true, nullable = false)
    private String fromFlightCode;

    /**
     * The to flight.
     */
    @Column(unique = true, nullable = false)
    private String toFlightCode;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(String airlineId) {
        this.airlineId = airlineId;
    }

    /**
     * Gets the business seats.
     *
     * @return the business seats
     */
    public Long getBusinessSeats() {
        return businessSeats;
    }

    /**
     * Sets the business seats.
     *
     * @param businessSeats the new business seats
     */
    public void setBusinessSeats(Long businessSeats) {
        this.businessSeats = businessSeats;
    }

    /**
     * Gets the non business seats.
     *
     * @return the non business seats
     */
    public Long getNonBusinessSeats() {
        return nonBusinessSeats;
    }

    /**
     * Sets the non business seats.
     *
     * @param nonBusinessSeats the new non business seats
     */
    public void setNonBusinessSeats(Long nonBusinessSeats) {
        this.nonBusinessSeats = nonBusinessSeats;
    }

    /**
     * Gets the no of rows.
     *
     * @return the no of rows
     */
    public Long getNoOfRows() {
        return noOfRows;
    }

    /**
     * Sets the no of rows.
     *
     * @param noOfRows the new no of rows
     */
    public void setNoOfRows(Long noOfRows) {
        this.noOfRows = noOfRows;
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

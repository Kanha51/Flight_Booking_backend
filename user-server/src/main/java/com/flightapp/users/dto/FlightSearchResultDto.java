package com.flightapp.users.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Flight search result dto.
 */
@Data
public class FlightSearchResultDto implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Start date time.
     */
    private Date startDateTime;

    /**
     * The Airline name.
     */
    private String airlineName;
    /**
     * The Logo.
     */
    private byte[] logo;
    /**
     * The Price.
     */
    private Double price;
    /**
     * The Flight from.
     */
    private String flightFrom;
    /**
     * The Flight to.
     */
    private String flightTo;
    /**
     * The Round trip.
     */
    private int roundTrip;
}

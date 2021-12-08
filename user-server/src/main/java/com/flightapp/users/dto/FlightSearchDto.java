package com.flightapp.users.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * The type Flight search dto.
 */
@Data
public class FlightSearchDto implements Serializable {


    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Travel date time.
     */
    private Date travelStartDate;

    /**
     * The Travel end date.
     */
    private Date travelEndDate;
    /**
     * The From place.
     */
    private String fromPlace;
    /**
     * The To place.
     */
    private String toPlace;
    /**
     * The Round trip.
     */
    private int roundTrip;
}

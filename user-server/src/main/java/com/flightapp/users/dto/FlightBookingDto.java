package com.flightapp.users.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class FlightBookingDto implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

  

    /**
     * The Flight no.
     */
    private String flightNo;

    /**
     * The Date time.
     */
    private Date dateTime;

    /**
     * The Flight from.
     */
    private String flightFrom;

    /**
     * The Flight to.
     */
    private String flightTo;

    /**
     * The Customer name.
     */
    private String customerName;

    /**
     * The Customer email id.
     */
    private String customerEmailId;

    /**
     * The No of seats.
     */
    private int noOfSeats;

    /**
     * The Meal type.
     */
    private String mealType;

    List<FlightPassangerInfoDto> passangerInfo;
    
    
    
}
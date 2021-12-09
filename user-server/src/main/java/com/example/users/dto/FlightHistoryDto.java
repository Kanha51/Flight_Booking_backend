package com.example.users.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FlightHistoryDto {
    List<FlightPassangerInfoDto> passangersInfo;
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
    private String flightFromCode;
    private Double flightTime;
    /**
     * The Flight to.
     */
    private String flightToCode;
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
    private int seatType;
    /**
     * The Meal type.
     */
    private String mealType;
    private String pnrNo;
    /**
     * The Cancel ticket.
     */
    private int cancelTicket;
    /**
     * The Total price.
     */
    private Double totalPrice;
    private Double discount;
    private Double discountPercentage;
    private Double tax;
    private Double price;
    private Date bookingDateTime;

}

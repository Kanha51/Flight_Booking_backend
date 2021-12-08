package com.flightapp.users.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * The type Flight booking detail.
 */
@Data
@Entity
public class FlightBookingDetailEntity implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Flight booking detail id.
     */
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="FLIGHT_ID")
    private Long flightBookingDetailId;

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

    /**
     * The Pnr no.
     */
    @JsonIgnore
    private String pnrNo;

    /**
     * The Cancel ticket.
     */
    private int cancelTicket = 0;

    /**
     * The Total price.
     */
    private Double totalPrice;

	public FlightBookingDetailEntity(String flightNo, Date dateTime, String flightFrom, String flightTo,
			String customerName, String customerEmailId, int noOfSeats, String mealType,String pnrNo) {
		super();
		this.flightNo = flightNo;
		this.dateTime = dateTime;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.noOfSeats = noOfSeats;
		this.mealType = mealType;
		this.pnrNo =pnrNo;
	}
    
	public FlightBookingDetailEntity()
	{
		super();
	}
}

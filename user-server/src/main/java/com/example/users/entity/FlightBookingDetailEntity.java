package com.example.users.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FLIGHT_ID")
    private Long flightBookingDetailId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    private UserLoginEntity userId;
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

    /**
     * The Pnr no.
     */
    private String pnrNo;

    /**
     * The Cancel ticket.
     */
    private int cancelTicket = 0;

    /**
     * The Total price.
     */
    private Double totalPrice;

    private Double discount;

    private Double discountPercentage;


    private Double tax;

    private Double price;

    private Date bookingDateTime = new Date();

    public FlightBookingDetailEntity() {
        super();
    }

    public FlightBookingDetailEntity(Long flightBookingDetailId) {
        this.flightBookingDetailId = flightBookingDetailId;
    }

    public Long getFlightBookingDetailId() {
        return flightBookingDetailId;
    }

    public void setFlightBookingDetailId(Long flightBookingDetailId) {
        this.flightBookingDetailId = flightBookingDetailId;
    }

    public UserLoginEntity getUserId() {
        return userId;
    }

    public void setUserId(UserLoginEntity userId) {
        this.userId = userId;
    }
}

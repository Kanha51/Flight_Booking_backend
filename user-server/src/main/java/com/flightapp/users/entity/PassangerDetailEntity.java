package com.flightapp.users.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The type Passanger detail entity.
 */
@Table
@Entity
public class PassangerDetailEntity implements Serializable {

    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * The Passanger details id.
     */
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passangerDetailsId;

    /**
     * The Flight booking id.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FLIGHT_BOOKING_ID", referencedColumnName = "FLIGHT_ID")
    private FlightBookingDetailEntity flightBookingId;

    /**
     * The Passanger name.
     */
    private String passangerName;

    /**
     * The Passanger gender.
     */
    private String passangerGender;

    /**
     * The Passanger age.
     */
    private int passangerAge;

    /**
     * The Price.
     */
    private Double price;

	public PassangerDetailEntity() {
		super();
		
	}

	public PassangerDetailEntity(FlightBookingDetailEntity flightBookingId, String passangerName,
			String passangerGender, int passangerAge) {
		super();
		this.flightBookingId = flightBookingId;
		this.passangerName = passangerName;
		this.passangerGender = passangerGender;
		this.passangerAge = passangerAge;
	}
	
	

}

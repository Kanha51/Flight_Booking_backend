package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

/**
 * The Class FlightSeatPriceEntity.
 */
@Entity
@Table(name = "Flight_Seat_Price")
@Data
public class FlightSeatPriceEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** The airline id. */
	@JoinColumn(name = "airlineId", referencedColumnName = "id")
	private AirlineDataEntity airlineId;

	/** The flight id. */
	@JoinColumn(name = "flightId", referencedColumnName = "id")
	private FlightDataEntity flightId;

	/** The seat type. */
	@Column(unique = true, nullable = false)
	private Long seatType;

	/** The discount. */
	@Column(unique = true, nullable = false)
	private Double discount;

	/** The tax. */
	@Column(unique = true, nullable = false)
	private Double tax;

	/** The other charges. */
	private Double otherCharges;

	/** The ticket cost. */
	@Column(unique = true, nullable = false)
	private Double ticketCost;

	/** The other charge info. */
	private String otherChargeInfo;

}

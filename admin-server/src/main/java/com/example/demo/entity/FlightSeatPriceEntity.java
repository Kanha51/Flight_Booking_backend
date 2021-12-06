package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

// TODO: Auto-generated Javadoc
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
	private Long airlineId;

	/** The flight id. */
	private Long flightId;

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

	/**
	 * Gets the airline id.
	 *
	 * @return the airline id
	 */
	public Long getAirlineId() {
		return airlineId;
	}

	/**
	 * Sets the airline id.
	 *
	 * @param airlineId the new airline id
	 */
	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}

	/**
	 * Gets the flight id.
	 *
	 * @return the flight id
	 */
	public Long getFlightId() {
		return flightId;
	}

	/**
	 * Sets the flight id.
	 *
	 * @param flightId the new flight id
	 */
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	/**
	 * Gets the seat type.
	 *
	 * @return the seat type
	 */
	public Long getSeatType() {
		return seatType;
	}

	/**
	 * Sets the seat type.
	 *
	 * @param seatType the new seat type
	 */
	public void setSeatType(Long seatType) {
		this.seatType = seatType;
	}

	/**
	 * Gets the discount.
	 *
	 * @return the discount
	 */
	public Double getDiscount() {
		return discount;
	}

	/**
	 * Sets the discount.
	 *
	 * @param discount the new discount
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	/**
	 * Gets the tax.
	 *
	 * @return the tax
	 */
	public Double getTax() {
		return tax;
	}

	/**
	 * Sets the tax.
	 *
	 * @param tax the new tax
	 */
	public void setTax(Double tax) {
		this.tax = tax;
	}

	/**
	 * Gets the other charges.
	 *
	 * @return the other charges
	 */
	public Double getOtherCharges() {
		return otherCharges;
	}

	/**
	 * Sets the other charges.
	 *
	 * @param otherCharges the new other charges
	 */
	public void setOtherCharges(Double otherCharges) {
		this.otherCharges = otherCharges;
	}

	/**
	 * Gets the ticket cost.
	 *
	 * @return the ticket cost
	 */
	public Double getTicketCost() {
		return ticketCost;
	}

	/**
	 * Sets the ticket cost.
	 *
	 * @param ticketCost the new ticket cost
	 */
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	/**
	 * Gets the other charge info.
	 *
	 * @return the other charge info
	 */
	public String getOtherChargeInfo() {
		return otherChargeInfo;
	}

	/**
	 * Sets the other charge info.
	 *
	 * @param otherChargeInfo the new other charge info
	 */
	public void setOtherChargeInfo(String otherChargeInfo) {
		this.otherChargeInfo = otherChargeInfo;
	}

}

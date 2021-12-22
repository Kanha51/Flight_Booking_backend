package com.example.adminserver.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * The Class FlightScheduleEntity.
 */
@Entity
@Table(name = "Flight_Schedule_Entity")
@Data
public class FlightScheduleEntity {

	/**
	 * The id.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/**
	 * The take off time.
	 */
	private Date takeOffTime;

	/**
	 * The landing time.
	 */
	private Date landingTime;

	/**
	 * The business seats.
	 */
	private Long businessSeats;

	/**
	 * The non business seats.
	 */
	private Long nonBusinessSeats;

	/**
	 * The no of rows.
	 */
	private Long noOfRows;

	/**
	 * The discount.
	 */
	private Double discount;

	/**
	 * The tax.
	 */
	private Double tax;

	/**
	 * The other charges.
	 */
	private Double otherCharges;

	/**
	 * The ticket cost.
	 */
	private Double ticketCost;

	/**
	 * The other charge info.
	 */
	private String otherChargeInfo;

	/** The flight no. */
	private String flightNo;

	/** The block. */
	private int block = 0;

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
	 * Gets the take off time.
	 *
	 * @return the take off time
	 */
	public java.util.Date getTakeOffTime() {
		return takeOffTime;
	}

	/**
	 * Sets the take off time.
	 *
	 * @param takeOffTime the new take off time
	 */
	public void setTakeOffTime(java.util.Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	/**
	 * Gets the landing time.
	 *
	 * @return the landing time
	 */
	public java.util.Date getLandingTime() {
		return landingTime;
	}

	/**
	 * Sets the landing time.
	 *
	 * @param landingTime the new landing time
	 */
	public void setLandingTime(java.util.Date landingTime) {
		this.landingTime = landingTime;
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

	/**
	 * Gets the flight no.
	 *
	 * @return the flight no
	 */
	public String getFlightNo() {
		return flightNo;
	}

	/**
	 * Sets the flight no.
	 *
	 * @param flightNo the new flight no
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	/**
	 * Gets the block.
	 *
	 * @return the block
	 */
	public int getBlock() {
		return block;
	}

	/**
	 * Sets the block.
	 *
	 * @param block the new block
	 */
	public void setBlock(int block) {
		this.block = block;
	}
}

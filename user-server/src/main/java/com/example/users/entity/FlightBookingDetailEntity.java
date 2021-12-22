package com.example.users.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FLIGHT_ID")
	private Long flightBookingDetailId;
	/**
	 * The Flight no.
	 */

	private String airlineName;
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

	/** The flight from code. */
	private String flightFromCode;

	/** The flight time. */
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

	/** The seat type. */
	private int seatType;

	/**
	 * The Meal type.
	 */
	private String mealType;

	/**
	 * The Total price.
	 */
	private Double totalPrice;

	/** The discount. */
	private Double discount;

	/** The discount percentage. */
	private Double discountPercentage;

	/** The price. */
	private Double price;

	/** The cancel ticket. */
	private int cancelTicket;

	/** The pnr no. */
	private String pnrNo;

	/** The take off time. */
	private java.util.Date takeOffTime;

	/** The landing time. */
	private java.util.Date landingTime;

	/**
	 * Gets the flight booking detail id.
	 *
	 * @return the flight booking detail id
	 */
	public Long getFlightBookingDetailId() {
		return flightBookingDetailId;
	}

	/**
	 * Sets the flight booking detail id.
	 *
	 * @param flightBookingDetailId the new flight booking detail id
	 */
	public void setFlightBookingDetailId(Long flightBookingDetailId) {
		this.flightBookingDetailId = flightBookingDetailId;
	}

	/**
	 * Gets the airline name.
	 *
	 * @return the airline name
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * Sets the airline name.
	 *
	 * @param airlineName the new airline name
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
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
	 * Gets the date time.
	 *
	 * @return the date time
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * Sets the date time.
	 *
	 * @param dateTime the new date time
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Gets the flight from.
	 *
	 * @return the flight from
	 */
	public String getFlightFrom() {
		return flightFrom;
	}

	/**
	 * Sets the flight from.
	 *
	 * @param flightFrom the new flight from
	 */
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}

	/**
	 * Gets the flight to.
	 *
	 * @return the flight to
	 */
	public String getFlightTo() {
		return flightTo;
	}

	/**
	 * Sets the flight to.
	 *
	 * @param flightTo the new flight to
	 */
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}

	/**
	 * Gets the flight from code.
	 *
	 * @return the flight from code
	 */
	public String getFlightFromCode() {
		return flightFromCode;
	}

	/**
	 * Sets the flight from code.
	 *
	 * @param flightFromCode the new flight from code
	 */
	public void setFlightFromCode(String flightFromCode) {
		this.flightFromCode = flightFromCode;
	}

	/**
	 * Gets the flight time.
	 *
	 * @return the flight time
	 */
	public Double getFlightTime() {
		return flightTime;
	}

	/**
	 * Sets the flight time.
	 *
	 * @param flightTime the new flight time
	 */
	public void setFlightTime(Double flightTime) {
		this.flightTime = flightTime;
	}

	/**
	 * Gets the flight to code.
	 *
	 * @return the flight to code
	 */
	public String getFlightToCode() {
		return flightToCode;
	}

	/**
	 * Sets the flight to code.
	 *
	 * @param flightToCode the new flight to code
	 */
	public void setFlightToCode(String flightToCode) {
		this.flightToCode = flightToCode;
	}

	/**
	 * Gets the customer name.
	 *
	 * @return the customer name
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Sets the customer name.
	 *
	 * @param customerName the new customer name
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Gets the customer email id.
	 *
	 * @return the customer email id
	 */
	public String getCustomerEmailId() {
		return customerEmailId;
	}

	/**
	 * Sets the customer email id.
	 *
	 * @param customerEmailId the new customer email id
	 */
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	/**
	 * Gets the seat type.
	 *
	 * @return the seat type
	 */
	public int getSeatType() {
		return seatType;
	}

	/**
	 * Sets the seat type.
	 *
	 * @param seatType the new seat type
	 */
	public void setSeatType(int seatType) {
		this.seatType = seatType;
	}

	/**
	 * Gets the meal type.
	 *
	 * @return the meal type
	 */
	public String getMealType() {
		return mealType;
	}

	/**
	 * Sets the meal type.
	 *
	 * @param mealType the new meal type
	 */
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}

	/**
	 * Gets the total price.
	 *
	 * @return the total price
	 */
	public Double getTotalPrice() {
		return totalPrice;
	}

	/**
	 * Sets the total price.
	 *
	 * @param totalPrice the new total price
	 */
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
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
	 * Gets the discount percentage.
	 *
	 * @return the discount percentage
	 */
	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	/**
	 * Sets the discount percentage.
	 *
	 * @param discountPercentage the new discount percentage
	 */
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * Gets the cancel ticket.
	 *
	 * @return the cancel ticket
	 */
	public int getCancelTicket() {
		return cancelTicket;
	}

	/**
	 * Sets the cancel ticket.
	 *
	 * @param cancelTicket the new cancel ticket
	 */
	public void setCancelTicket(int cancelTicket) {
		this.cancelTicket = cancelTicket;
	}

	/**
	 * Gets the pnr no.
	 *
	 * @return the pnr no
	 */
	public String getPnrNo() {
		return pnrNo;
	}

	/**
	 * Sets the pnr no.
	 *
	 * @param pnrNo the new pnr no
	 */
	public void setPnrNo(String pnrNo) {
		this.pnrNo = pnrNo;
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
}

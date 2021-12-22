package com.example.adminserver.dto;

import java.io.Serializable;
import java.sql.Date;

/**
 * The type Flight search dto.
 */
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

	/**
	 * Gets the serial version UID.
	 *
	 * @return the serial version UID
	 */
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	/**
	 * Gets the travel start date.
	 *
	 * @return the travel start date
	 */
	public Date getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * Sets the travel start date.
	 *
	 * @param travelStartDate the new travel start date
	 */
	public void setTravelStartDate(Date travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * Gets the travel end date.
	 *
	 * @return the travel end date
	 */
	public Date getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * Sets the travel end date.
	 *
	 * @param travelEndDate the new travel end date
	 */
	public void setTravelEndDate(Date travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	/**
	 * Gets the from place.
	 *
	 * @return the from place
	 */
	public String getFromPlace() {
		return fromPlace;
	}

	/**
	 * Sets the from place.
	 *
	 * @param fromPlace the new from place
	 */
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	/**
	 * Gets the to place.
	 *
	 * @return the to place
	 */
	public String getToPlace() {
		return toPlace;
	}

	/**
	 * Sets the to place.
	 *
	 * @param toPlace the new to place
	 */
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	/**
	 * Gets the round trip.
	 *
	 * @return the round trip
	 */
	public int getRoundTrip() {
		return roundTrip;
	}

	/**
	 * Sets the round trip.
	 *
	 * @param roundTrip the new round trip
	 */
	public void setRoundTrip(int roundTrip) {
		this.roundTrip = roundTrip;
	}
}

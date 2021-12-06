package com.example.demo.dto;

/**
 * The Class FlightDataDto.
 */

public class FlightDataDto {

	/** The airline id. */
	private Long airlineId;

	/** The business seats. */
	private Long businessSeats;

	/** The non business seats. */
	private Long nonBusinessSeats;

	/** The no of rows. */
	private Long noOfRows;

	/** The meals. */
	private String meals;

	/** The instrument. */
	private String instrument;

	/** The from flight. */
	private String fromFlight;

	/** The to flight. */
	private String toFlight;

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
	 * Gets the meals.
	 *
	 * @return the meals
	 */
	public String getMeals() {
		return meals;
	}

	/**
	 * Sets the meals.
	 *
	 * @param meals the new meals
	 */
	public void setMeals(String meals) {
		this.meals = meals;
	}

	/**
	 * Gets the instrument.
	 *
	 * @return the instrument
	 */
	public String getInstrument() {
		return instrument;
	}

	/**
	 * Sets the instrument.
	 *
	 * @param instrument the new instrument
	 */
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	/**
	 * Gets the from flight.
	 *
	 * @return the from flight
	 */
	public String getFromFlight() {
		return fromFlight;
	}

	/**
	 * Sets the from flight.
	 *
	 * @param fromFlight the new from flight
	 */
	public void setFromFlight(String fromFlight) {
		this.fromFlight = fromFlight;
	}

	/**
	 * Gets the to flight.
	 *
	 * @return the to flight
	 */
	public String getToFlight() {
		return toFlight;
	}

	/**
	 * Sets the to flight.
	 *
	 * @param toFlight the new to flight
	 */
	public void setToFlight(String toFlight) {
		this.toFlight = toFlight;
	}

}

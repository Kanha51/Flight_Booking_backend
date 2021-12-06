package com.example.demo.dto;

/**
 * The Class FlightInfoScheduleDto.
 */
public class FlightInfoScheduleDto {

	/** The schedule data. */
	private FlightScheduleDto scheduleData;

	/** The flihgt data. */
	private FlightDataDto flihgtData;

	/** The seat price. */
	private FlightSeatPriceDto seatPrice;

	/**
	 * Gets the schedule data.
	 *
	 * @return the schedule data
	 */
	public FlightScheduleDto getScheduleData() {
		return scheduleData;
	}

	/**
	 * Sets the schedule data.
	 *
	 * @param scheduleData the new schedule data
	 */
	public void setScheduleData(FlightScheduleDto scheduleData) {
		this.scheduleData = scheduleData;
	}

	/**
	 * Gets the flihgt data.
	 *
	 * @return the flihgt data
	 */
	public FlightDataDto getFlihgtData() {
		return flihgtData;
	}

	/**
	 * Sets the flihgt data.
	 *
	 * @param flihgtData the new flihgt data
	 */
	public void setFlihgtData(FlightDataDto flihgtData) {
		this.flihgtData = flihgtData;
	}

	/**
	 * Gets the seat price.
	 *
	 * @return the seat price
	 */
	public FlightSeatPriceDto getSeatPrice() {
		return seatPrice;
	}

	/**
	 * Sets the seat price.
	 *
	 * @param seatPrice the new seat price
	 */
	public void setSeatPrice(FlightSeatPriceDto seatPrice) {
		this.seatPrice = seatPrice;
	}

}

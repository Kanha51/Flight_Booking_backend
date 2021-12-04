package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class FlightSeatPriceDto.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FlightSeatPriceDto {

	/** The airline id. */
	private Long airlineId;

	/** The flight id. */
	private Long flightId;

	/** The seat type. */
	private Long seatType;

	/** The discount. */
	private Double discount;

	/** The tax. */
	private Double tax;

	/** The other charges. */
	private Double otherCharges;

	/** The ticket cost. */
	private Double ticketCost;

	/** The other charge info. */
	private String otherChargeInfo;

}

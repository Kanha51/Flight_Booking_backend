package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class FlightDataDto.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
}

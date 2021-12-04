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
 * The Class FlightDataEntity.
 */
@Entity
@Table(name = "Flight_Data")
@Data
public class FlightDataEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** The airline id. */
	@JoinColumn(name = "airlineId", referencedColumnName = "id")
	private AirlineDataEntity airlineId;

	/** The business seats. */
	@Column(unique = true, nullable = false)
	private Long businessSeats;

	/** The non business seats. */
	@Column(unique = true, nullable = false)
	private Long nonBusinessSeats;

	/** The no of rows. */
	@Column(unique = true, nullable = false)
	private Long noOfRows;

	/** The meals. */
	@Column(unique = true, nullable = false)
	private String meals;

	/** The instrument. */
	@Column(unique = true, nullable = false)
	private String instrument;

	/** The from flight. */
	@Column(unique = true, nullable = false)
	private String fromFlight;

	/** The to flight. */
	@Column(unique = true, nullable = false)
	private String toFlight;

}

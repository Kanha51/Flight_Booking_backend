package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * The Class AirlineDataEntity.
 */
@Entity
@Table(name = "Airline_Data")
@Data
public class AirlineDataEntity {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	/** The airline name. */
	@Column(unique = true, nullable = false)
	private String airlineName;

	/** The logo. */
	@Column(unique = true, nullable = false)
	private Byte logo;

	/** The block. */
	private Integer block;

	/** The contact no. */
	@Column(unique = true, nullable = false)
	private Long contactNo;

	/** The airline address. */
	@Column(unique = true, nullable = false)
	private String airlineAddress;

}

package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class AirlineDataDto.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AirlineDataDto {

	/** The airline name. */
	private String airlineName;

	/** The logo. */
	private Byte logo;

	/** The block. */
	private Integer block;

	/** The contact no. */
	private Long contactNo;

	/** The airline address. */
	private String airlineAddress;
}
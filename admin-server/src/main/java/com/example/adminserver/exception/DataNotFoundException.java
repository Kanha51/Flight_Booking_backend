package com.example.adminserver.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The Class DataNotFoundException.
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** The message. */
	private String message;

}

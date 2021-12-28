package com.example.users.exception;

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

	/** The message. */
	private String message;

}

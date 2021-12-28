package com.example.adminserver.dto;

/**
 * The Class ErrorResponseModel.
 */
public class ErrorResponseModel {

	/** The message. */
	private String message;

	/** The status code. */
	private Integer statusCode;

	/** The error reporting time. */
	private Long errorReportingTime;

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the status code.
	 *
	 * @return the status code
	 */
	public Integer getStatusCode() {
		return statusCode;
	}

	/**
	 * Sets the status code.
	 *
	 * @param statusCode the new status code
	 */
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * Gets the error reporting time.
	 *
	 * @return the error reporting time
	 */
	public Long getErrorReportingTime() {
		return errorReportingTime;
	}

	/**
	 * Sets the error reporting time.
	 *
	 * @param errorReportingTime the new error reporting time
	 */
	public void setErrorReportingTime(Long errorReportingTime) {
		this.errorReportingTime = errorReportingTime;
	}

}
package com.example.adminserver.dto;

/**
 * The Class AirlineDataDto.
 */
public class AirlineDataDto {


	private String uniqueId;

	private Integer block;
	/**
	 * The airline name.
	 */
	private String airlineName;

	/**
	 * The logo.
	 */
	private Byte logo;

	/**
	 * The contact no.
	 */
	private Long contactNo;

	/**
	 * The airline address.
	 */
	private String airlineAddress;

	/**
	 * Instantiates a new airline data dto.
	 */
	public AirlineDataDto() {
	}

	/**
	 * Gets the airline name.
	 *
	 * @return the airline name
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * Sets the airline name.
	 *
	 * @param airlineName the new airline name
	 */
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	/**
	 * Gets the logo.
	 *
	 * @return the logo
	 */
	public Byte getLogo() {
		return logo;
	}

	/**
	 * Sets the logo.
	 *
	 * @param logo the new logo
	 */
	public void setLogo(Byte logo) {
		this.logo = logo;
	}

	/**
	 * Gets the contact no.
	 *
	 * @return the contact no
	 */
	public Long getContactNo() {
		return contactNo;
	}

	/**
	 * Sets the contact no.
	 *
	 * @param contactNo the new contact no
	 */
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * Gets the airline address.
	 *
	 * @return the airline address
	 */
	public String getAirlineAddress() {
		return airlineAddress;
	}

	/**
	 * Sets the airline address.
	 *
	 * @param airlineAddress the new airline address
	 */
	public void setAirlineAddress(String airlineAddress) {
		this.airlineAddress = airlineAddress;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public Integer getBlock() {
		return block;
	}

	public void setBlock(Integer block) {
		this.block = block;
	}
}
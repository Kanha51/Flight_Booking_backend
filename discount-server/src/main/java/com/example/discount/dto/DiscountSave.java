package com.example.discount.dto;

/**
 * The Class DiscountSave.
 */
public class DiscountSave {

	/** The discount description. */
	private String discountDescription;

	/** The discount code. */
	private String discountCode;

	/** The disable discount. */
	private String disableDiscount;

	/** The discount percentage. */
	private Double discountPercentage;

	/**
	 * Gets the discount description.
	 *
	 * @return the discount description
	 */
	public String getDiscountDescription() {
		return discountDescription;
	}

	/**
	 * Sets the discount description.
	 *
	 * @param discountDescription the new discount description
	 */
	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}

	/**
	 * Gets the discount code.
	 *
	 * @return the discount code
	 */
	public String getDiscountCode() {
		return discountCode;
	}

	/**
	 * Sets the discount code.
	 *
	 * @param discountCode the new discount code
	 */
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	/**
	 * Gets the disable discount.
	 *
	 * @return the disable discount
	 */
	public String getDisableDiscount() {
		return disableDiscount;
	}

	/**
	 * Sets the disable discount.
	 *
	 * @param disableDiscount the new disable discount
	 */
	public void setDisableDiscount(String disableDiscount) {
		this.disableDiscount = disableDiscount;
	}

	/**
	 * Gets the discount percentage.
	 *
	 * @return the discount percentage
	 */
	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	/**
	 * Sets the discount percentage.
	 *
	 * @param discountPercentage the new discount percentage
	 */
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}

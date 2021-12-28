package com.example.discount.service;

import java.util.List;

import com.example.discount.dto.DeleteDiscountDto;
import com.example.discount.dto.DiscountSave;

/**
 * The Interface DiscountService.
 */
public interface DiscountService {

	/**
	 * Save discount.
	 *
	 * @param dto the dto
	 * @return the discount save
	 */
	DiscountSave saveDiscount(DiscountSave dto);

	/**
	 * Gets the all discount.
	 *
	 * @return the all discount
	 */
	List<DiscountSave> getAllDiscount();

	/**
	 * Delete discount.
	 *
	 * @param dto the dto
	 * @return the delete discount dto
	 */
	DeleteDiscountDto deleteDiscount(DeleteDiscountDto dto);

	/**
	 * Check discount.
	 *
	 * @param dto the dto
	 * @return the discount save
	 */
	DiscountSave checkDiscount(DeleteDiscountDto dto);
}

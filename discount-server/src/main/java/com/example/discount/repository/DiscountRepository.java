package com.example.discount.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.example.discount.entity.DiscountEntity;

/**
 * The Interface DiscountRepository.
 */
@EnableScan
public interface DiscountRepository extends CrudRepository<DiscountEntity, String> {

	/**
	 * Find by discount code.
	 *
	 * @param discountCode the discount code
	 * @return the discount entity
	 */
	DiscountEntity findByDiscountCode(String discountCode);

}

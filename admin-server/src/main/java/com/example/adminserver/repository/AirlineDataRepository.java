package com.example.adminserver.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminserver.entity.AirlineDataEntity;

/**
 * The Interface AirlineDataRepository.
 */
@Repository
public interface AirlineDataRepository extends JpaRepository<AirlineDataEntity, Long> {

	/**
	 * Find by flight no.
	 *
	 * @param uniqueId the unique id
	 * @return the airline data entity
	 */
	AirlineDataEntity findByFlightNo(String uniqueId);

	/**
	 * Find by block.
	 *
	 * @param block the block
	 * @return the list
	 */
	List<AirlineDataEntity> findByBlock(Integer block);

	/**
	 * Find by from flight code and to flight code and start date and block.
	 *
	 * @param fromCode the from code
	 * @return the list
	 */
	List<AirlineDataEntity> findByFromFlightCodeAndToFlightCodeAndStartDateAndBlock(String fromCode, String toCode,
			Date starDate, int val);
}

package com.example.adminserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminserver.entity.FlightScheduleEntity;

/**
 * The Interface FlightScheduleRepository.
 */
@Repository
public interface FlightScheduleRepository extends JpaRepository<FlightScheduleEntity, Long> {

	/**
	 * Find by flight no.
	 *
	 * @param flightNo the flight no
	 * @return the flight schedule entity
	 */
	FlightScheduleEntity findByFlightNo(String flightNo);

	/**
	 * Find by flight no and non business seats not and business seats not.
	 *
	 * @param flightNo the flight no
	 * @param val      the val
	 * @param val1     the val 1
	 * @return the flight schedule entity
	 */
	FlightScheduleEntity findByFlightNoAndNonBusinessSeatsNotAndBusinessSeatsNot(String flightNo, int val, int val1);

	/**
	 * Find by block.
	 *
	 * @param block the block
	 * @return the list
	 */
	List<FlightScheduleEntity> findByBlock(int block);
}

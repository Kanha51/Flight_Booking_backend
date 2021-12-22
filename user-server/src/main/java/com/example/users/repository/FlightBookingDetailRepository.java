package com.example.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.users.entity.FlightBookingDetailEntity;

/**
 * The interface Flight booking detail repository.
 */
@Repository
public interface FlightBookingDetailRepository extends JpaRepository<FlightBookingDetailEntity, Long> {

	/**
	 * Find by pnr no list.
	 *
	 * @param pnrNo the pnr no
	 * @return the list
	 */
	FlightBookingDetailEntity findByPnrNo(String pnrNo);

	/**
	 * Find by customer email id list.
	 *
	 * @param emailId the email id
	 * @param pnrNo   the pnr no
	 * @return the list
	 */
	List<FlightBookingDetailEntity> findByCustomerEmailIdOrPnrNo(String emailId, String pnrNo);

	/**
	 * Find by customer email id.
	 *
	 * @param customerEmailId the customer email id
	 * @return the list
	 */
	List<FlightBookingDetailEntity> findByCustomerEmailId(String customerEmailId);
}

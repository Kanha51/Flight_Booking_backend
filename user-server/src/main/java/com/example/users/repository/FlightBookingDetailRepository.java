package com.example.users.repository;

import com.example.users.entity.FlightBookingDetailEntity;
import com.example.users.entity.UserLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    List<FlightBookingDetailEntity> findByPnrNo(String pnrNo);


    /**
     * Find by customer email id list.
     *
     * @param emailId the email id
     * @return the list
     */
    List<FlightBookingDetailEntity> findByCustomerEmailIdOrPnrNo(String emailId, String pnrNo);

    List<FlightBookingDetailEntity> findByUserId(UserLoginEntity userLoginEntity);
}

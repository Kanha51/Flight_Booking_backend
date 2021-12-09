package com.example.users.repository;

import com.example.users.entity.FlightBookingDetailEntity;
import com.example.users.entity.PassangerDetailEntity;
import com.example.users.entity.UserLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Passanger detail repository.
 */
@Repository
public interface PassangerDetailRepository extends JpaRepository<PassangerDetailEntity, Long> {
    List<PassangerDetailEntity> findByUserId(UserLoginEntity userLoginEntity);

    List<PassangerDetailEntity> findByFlightId(FlightBookingDetailEntity flightId);
}

package com.flightapp.users.repository;

import com.flightapp.users.entity.PassangerDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Passanger detail repository.
 */
@Repository
public interface PassangerDetailRepository extends JpaRepository<PassangerDetailEntity, Long> {
}

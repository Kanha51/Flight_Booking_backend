package com.example.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.users.entity.PassangerDetailEntity;

/**
 * The interface Passanger detail repository.
 */
@Repository
public interface PassangerDetailRepository extends JpaRepository<PassangerDetailEntity, Long> {

}

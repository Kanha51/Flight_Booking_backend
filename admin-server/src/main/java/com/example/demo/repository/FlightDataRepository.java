package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FlightDataEntity;

@Repository
public interface FlightDataRepository extends JpaRepository<FlightDataEntity, Long> {

}

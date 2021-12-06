package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FlightScheduleEntity;

@Repository
public interface FlightScheduleRepository extends JpaRepository<FlightScheduleEntity, Long> {

}

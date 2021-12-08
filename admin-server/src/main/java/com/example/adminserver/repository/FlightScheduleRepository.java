package com.example.adminserver.repository;

import com.example.adminserver.entity.FlightScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightScheduleRepository extends JpaRepository<FlightScheduleEntity, Long> {

}
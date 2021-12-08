package com.example.adminserver.repository;

import com.example.adminserver.entity.FlightDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDataRepository extends JpaRepository<FlightDataEntity, Long> {

}

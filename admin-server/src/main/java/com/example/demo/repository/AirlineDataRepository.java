package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AirlineDataEntity;

@Repository
public interface AirlineDataRepository extends JpaRepository<AirlineDataEntity, Long> {

	AirlineDataEntity findByAirlineNameOrContactNoOrAirlineAddress(String airlineName, Long contactNo,
			String airlineAddress);

}

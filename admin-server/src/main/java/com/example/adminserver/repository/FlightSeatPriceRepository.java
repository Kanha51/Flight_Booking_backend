package com.example.adminserver.repository;


import com.example.adminserver.entity.FlightSeatPriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightSeatPriceRepository extends JpaRepository<FlightSeatPriceEntity, Long> {

}

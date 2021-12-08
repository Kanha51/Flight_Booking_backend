package com.example.adminserver.repository;


import com.example.adminserver.entity.AirlineDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineDataRepository extends JpaRepository<AirlineDataEntity, Long> {

    AirlineDataEntity findByUniqueId(String uniqueId);

}

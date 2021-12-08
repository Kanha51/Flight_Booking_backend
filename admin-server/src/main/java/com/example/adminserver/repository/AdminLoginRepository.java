package com.example.adminserver.repository;

import com.example.adminserver.entity.AdminLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLoginEntity, Long> {


    Optional<AdminLoginEntity> findByUsername(String userName);

    Optional<AdminLoginEntity> findByUsernameAndPassword(String username, String password);
}

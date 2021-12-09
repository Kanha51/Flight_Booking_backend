package com.example.users.repository;

import com.example.users.entity.UserLoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserLoginRepository extends JpaRepository<UserLoginEntity, Long> {
    Optional<UserLoginEntity> findByEmailId(String username);

    Optional<UserLoginEntity> findByEmailIdAndPassword(String username, String password);
}

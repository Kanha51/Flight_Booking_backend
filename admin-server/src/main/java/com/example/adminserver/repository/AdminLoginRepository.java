package com.example.adminserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminserver.entity.AdminLoginEntity;

/**
 * The Interface AdminLoginRepository.
 */
@Repository
public interface AdminLoginRepository extends JpaRepository<AdminLoginEntity, Long> {

	/**
	 * Find by username.
	 *
	 * @param userName the user name
	 * @return the optional
	 */
	Optional<AdminLoginEntity> findByUsername(String userName);

	/**
	 * Find by username and password.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the optional
	 */
	Optional<AdminLoginEntity> findByUsernameAndPassword(String username, String password);
}

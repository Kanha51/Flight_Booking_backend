package com.example.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.users.entity.UserLoginEntity;

/**
 * The Interface UserLoginRepository.
 */
@Repository
public interface UserLoginRepository extends JpaRepository<UserLoginEntity, Long> {

	/**
	 * Find by email id.
	 *
	 * @param username the username
	 * @return the optional
	 */
	Optional<UserLoginEntity> findByEmailId(String username);

	/**
	 * Find by email id and password.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the optional
	 */
	Optional<UserLoginEntity> findByEmailIdAndPassword(String username, String password);
}

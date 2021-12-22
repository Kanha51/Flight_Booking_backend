package com.example.users.service;

import com.example.users.dto.JwtRequest;
import com.example.users.dto.JwtResponse;

/**
 * The Interface UserLoginService.
 */
public interface UserLoginService {

	/**
	 * Authenticate user.
	 *
	 * @param jwtRequest the jwt request
	 * @return the jwt response
	 * @throws Exception the exception
	 */
	JwtResponse authenticateUser(JwtRequest jwtRequest) throws Exception;
}

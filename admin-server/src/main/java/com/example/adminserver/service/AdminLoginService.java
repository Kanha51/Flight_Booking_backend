package com.example.adminserver.service;

import com.example.adminserver.dto.JwtRequest;
import com.example.adminserver.dto.JwtResponse;

/**
 * The Interface AdminLoginService.
 */
public interface AdminLoginService {

	/**
	 * Authenticate admin.
	 *
	 * @param jwtRequest the jwt request
	 * @return the jwt response
	 * @throws Exception the exception
	 */
	JwtResponse authenticateAdmin(JwtRequest jwtRequest) throws Exception;
}

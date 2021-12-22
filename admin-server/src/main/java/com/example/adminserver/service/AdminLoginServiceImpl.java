package com.example.adminserver.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.adminserver.dto.JwtRequest;
import com.example.adminserver.dto.JwtResponse;
import com.example.adminserver.entity.AdminLoginEntity;
import com.example.adminserver.repository.AdminLoginRepository;
import com.example.adminserver.security.JwtTokenService;
import com.example.adminserver.security.JwtUserDetailsService;

/**
 * The Class AdminLoginServiceImpl.
 */
@Service
public class AdminLoginServiceImpl implements AdminLoginService {

	/**
	 * The Jwt token service.
	 */

	private final JwtTokenService jwtTokenService;
	/**
	 * The Jwt user details service.
	 */

	private final JwtUserDetailsService jwtUserDetailsService;

	/** The admin login repo. */
	private final AdminLoginRepository adminLoginRepo;

	/**
	 * Instantiates a new admin login service impl.
	 *
	 * @param jwtTokenService       the jwt token service
	 * @param jwtUserDetailsService the jwt user details service
	 * @param adminLoginRepo        the admin login repo
	 */
	public AdminLoginServiceImpl(JwtTokenService jwtTokenService, JwtUserDetailsService jwtUserDetailsService,
			AdminLoginRepository adminLoginRepo) {
		this.jwtTokenService = jwtTokenService;
		this.jwtUserDetailsService = jwtUserDetailsService;
		this.adminLoginRepo = adminLoginRepo;
	}

	@Override
	public JwtResponse authenticateAdmin(JwtRequest jwtRequest) throws Exception {

		JwtResponse response = new JwtResponse();
		authenticate(jwtRequest.getUsername(), jwtRequest.getPassword());
		UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
		String token = jwtTokenService.generateToken(userDetails);
		response.setToken(token);
		return response;
	}

	/**
	 * Authenticate.
	 *
	 * @param username the username
	 * @param password the password
	 * @throws Exception the exception
	 */
	private void authenticate(String username, String password) throws Exception {
		try {
			Optional<AdminLoginEntity> adminData = adminLoginRepo.findByUsernameAndPassword(username, password);
			if (!adminData.isPresent()) {

				throw new Exception("Invalid or Bad Credentials");
			}
		} catch (Exception ex) {
			throw new Exception("Invalid or Bad Credentials", ex);
		}
	}
}

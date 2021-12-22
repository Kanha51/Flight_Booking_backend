package com.example.users.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.example.users.dto.JwtRequest;
import com.example.users.dto.JwtResponse;
import com.example.users.entity.UserLoginEntity;
import com.example.users.repository.UserLoginRepository;
import com.example.users.security.JwtTokenService;
import com.example.users.security.JwtUserDetailsService;

/**
 * The Class UserLoginServiceImpl.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

	/**
	 * The Jwt token service.
	 */
	private final JwtTokenService jwtTokenService;
	/**
	 * The Jwt user details service.
	 */
	private final JwtUserDetailsService jwtUserDetailsService;

	/** The user login repo. */
	private final UserLoginRepository userLoginRepo;

	/**
	 * Instantiates a new user login service impl.
	 *
	 * @param jwtTokenService       the jwt token service
	 * @param jwtUserDetailsService the jwt user details service
	 * @param userLoginRepo         the user login repo
	 */
	public UserLoginServiceImpl(JwtTokenService jwtTokenService, JwtUserDetailsService jwtUserDetailsService,
			UserLoginRepository userLoginRepo) {
		this.jwtTokenService = jwtTokenService;
		this.jwtUserDetailsService = jwtUserDetailsService;
		this.userLoginRepo = userLoginRepo;
	}

	@Override
	public JwtResponse authenticateUser(JwtRequest jwtRequest) throws Exception {

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
			Optional<UserLoginEntity> adminData = userLoginRepo.findByEmailIdAndPassword(username, password);
			if (!adminData.isPresent()) {

				throw new Exception("Invalid or Bad Credentials");
			}
		} catch (Exception ex) {
			throw new Exception("Invalid or Bad Credentials", ex);
		}
	}
}

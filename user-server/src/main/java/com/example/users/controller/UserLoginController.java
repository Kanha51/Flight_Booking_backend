package com.example.users.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.dto.JwtRequest;
import com.example.users.dto.JwtResponse;
import com.example.users.service.UserLoginService;
import com.example.users.util.UserConstant;

/**
 * The Class UserLoginController.
 */
@RestController
@RequestMapping(UserConstant.URL_USER_LOGIN)
@CrossOrigin(origins = "*")
public class UserLoginController {

	/** The service. */
	private final UserLoginService service;

	/**
	 * Instantiates a new user login controller.
	 *
	 * @param service the service
	 */
	public UserLoginController(UserLoginService service) {
		this.service = service;
	}

	/**
	 * Creates the token.
	 *
	 * @param jwtRequest the jwt request
	 * @return the response entity
	 * @throws Exception the exception
	 */
	@PostMapping(UserConstant.URL_USER_LOGIN_)
	public ResponseEntity<JwtResponse> createToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		return ResponseEntity.ok(service.authenticateUser(jwtRequest));
	}
}

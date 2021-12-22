package com.example.adminserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminserver.dto.JwtRequest;
import com.example.adminserver.dto.JwtResponse;
import com.example.adminserver.service.AdminLoginService;
import com.example.adminserver.util.AdminConstant;

/**
 * The Class AdminLoginController.
 */
@RestController
@RequestMapping(AdminConstant.URL_ADMIN)
@CrossOrigin(origins = "http://localhost:3000")
public class AdminLoginController {

	/** The service. */
	private final AdminLoginService service;

	/**
	 * Instantiates a new admin login controller.
	 *
	 * @param service the service
	 */
	public AdminLoginController(AdminLoginService service) {
		this.service = service;
	}

	/**
	 * Creates the token.
	 *
	 * @param jwtRequest the jwt request
	 * @return the response entity
	 * @throws Exception the exception
	 */
	@PostMapping(AdminConstant.URL_ADMIN_LOGIN)
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<JwtResponse> createToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		return ResponseEntity.ok(service.authenticateAdmin(jwtRequest));
	}
}
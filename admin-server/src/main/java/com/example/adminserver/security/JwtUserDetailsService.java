package com.example.adminserver.security;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.adminserver.entity.AdminLoginEntity;
import com.example.adminserver.repository.AdminLoginRepository;

/**
 * The type Jwt user details service.
 */
@Component
public class JwtUserDetailsService implements UserDetailsService {

	/** The admin repo. */
	private final AdminLoginRepository adminRepo;

	/**
	 * Instantiates a new jwt user details service.
	 *
	 * @param adminRepo the admin repo
	 */
	public JwtUserDetailsService(AdminLoginRepository adminRepo) {
		this.adminRepo = adminRepo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AdminLoginEntity> adminData = adminRepo.findByUsername(username);
		if (adminData.isPresent()) {
			return new User(adminData.get().getUsername(), adminData.get().getPassword(), new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("No user found with " + username);
		}
	}
}

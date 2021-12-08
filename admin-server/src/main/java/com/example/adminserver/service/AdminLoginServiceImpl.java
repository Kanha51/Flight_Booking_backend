package com.example.adminserver.service;

import com.example.adminserver.dto.JwtRequest;
import com.example.adminserver.dto.JwtResponse;
import com.example.adminserver.entity.AdminLoginEntity;
import com.example.adminserver.repository.AdminLoginRepository;
import com.example.adminserver.security.JwtTokenService;
import com.example.adminserver.security.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    /**
     * The Jwt token service.
     */
    @Autowired
    private JwtTokenService jwtTokenService;
    /**
     * The Jwt user details service.
     */
    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;


    @Autowired
    private AdminLoginRepository adminLoginRepo;


    private void saveData() {
        AdminLoginEntity entity = new AdminLoginEntity();
        entity.setPassword("YWRtaW4=");
        entity.setUsername("admin");
        adminLoginRepo.save(entity);
    }

    @Override
    public JwtResponse authenticateAdmin(JwtRequest jwtRequest) throws Exception {
        if (!adminLoginRepo.findByUsername(jwtRequest.getUsername()).isPresent()) {
            saveData();
        }
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

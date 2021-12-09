package com.example.users.service;

import com.example.users.dto.JwtRequest;
import com.example.users.dto.JwtResponse;
import com.example.users.entity.UserLoginEntity;
import com.example.users.repository.UserLoginRepository;
import com.example.users.security.JwtTokenService;
import com.example.users.security.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserLoginServiceImpl implements UserLoginService {


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
    private UserLoginRepository userLoginRepo;


    private void saveData() {
        UserLoginEntity entity = new UserLoginEntity();
        entity.setPassword("YWRtaW4=");
        entity.setEmailId("test@test.com");
        entity.setfName("F_Test");
        entity.setlName("L_Name");
        userLoginRepo.save(entity);
    }

    @Override
    public JwtResponse authenticateUser(JwtRequest jwtRequest) throws Exception {
        if (!userLoginRepo.findByEmailId(jwtRequest.getUsername()).isPresent()) {
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
            Optional<UserLoginEntity> adminData = userLoginRepo.findByEmailIdAndPassword(username, password);
            if (!adminData.isPresent()) {

                throw new Exception("Invalid or Bad Credentials");
            }
        } catch (Exception ex) {
            throw new Exception("Invalid or Bad Credentials", ex);
        }
    }
}

package com.example.users.controller;

import com.example.users.dto.JwtRequest;
import com.example.users.dto.JwtResponse;
import com.example.users.service.UserLoginService;
import com.example.users.util.UserConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(UserConstant.URL_USER_LOGIN)
public class UserLoginController {

    @Autowired
    private UserLoginService service;


    @PostMapping(UserConstant.URL_USER_LOGIN_)
    public ResponseEntity<JwtResponse> createToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return ResponseEntity.ok(service.authenticateUser(jwtRequest));
    }
}

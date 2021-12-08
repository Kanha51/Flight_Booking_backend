package com.example.adminserver.controller;

import com.example.adminserver.dto.JwtRequest;
import com.example.adminserver.dto.JwtResponse;
import com.example.adminserver.service.AdminLoginService;
import com.example.adminserver.util.AdminConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AdminConstant.URL_ADMIN)
public class AdminLoginController {
    @Autowired
    private AdminLoginService service;


    @PostMapping(AdminConstant.URL_ADMIN_LOGIN)
    public ResponseEntity<JwtResponse> createToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return ResponseEntity.ok(service.authenticateAdmin(jwtRequest));
    }
}
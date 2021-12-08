package com.example.adminserver.service;

import com.example.adminserver.dto.JwtRequest;
import com.example.adminserver.dto.JwtResponse;

public interface AdminLoginService {
    

    JwtResponse authenticateAdmin(JwtRequest jwtRequest) throws Exception;
}

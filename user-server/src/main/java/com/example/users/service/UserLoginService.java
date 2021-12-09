package com.example.users.service;

import com.example.users.dto.JwtRequest;
import com.example.users.dto.JwtResponse;

public interface UserLoginService {
    JwtResponse authenticateUser(JwtRequest jwtRequest) throws Exception;
}

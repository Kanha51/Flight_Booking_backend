package com.example.users.security;


import com.example.users.entity.UserLoginEntity;
import com.example.users.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

/**
 * The type Jwt user details service.
 */
@Component
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserLoginRepository userLoginRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserLoginEntity> userData = userLoginRepository.findByEmailId(username);
        if (userData.isPresent()) {
            return new User(userData.get().getEmailId(), userData.get().getPassword(), new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("No user found with " + username);
        }
    }
}

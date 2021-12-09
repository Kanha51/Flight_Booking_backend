package com.example.users.security.filter;

import com.example.users.security.JwtTokenService;
import com.example.users.security.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The type Jwt request filter.
 */
@Component
public class JwtRequestFilter extends OncePerRequestFilter {

    /**
     * The Jwt user details service.
     */
    private JwtUserDetailsService jwtUserDetailsService;
    /**
     * The Jwt token service.
     */
    private JwtTokenService jwtTokenService;

    /**
     * Instantiates a new Jwt request filter.
     *
     * @param jwtUserDetailsService the jwt user details service
     * @param jwtTokenService       the jwt token service
     */
    @Autowired
    public JwtRequestFilter(JwtUserDetailsService jwtUserDetailsService, JwtTokenService jwtTokenService) {
        this.jwtTokenService = jwtTokenService;
        this.jwtUserDetailsService = jwtUserDetailsService;
    }


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String requestHeader = request.getHeader("Authorization");
        String username;
        String jwtToken;

        if (requestHeader != null && requestHeader.startsWith("Bearer")) {
            jwtToken = requestHeader.substring(7);
            username = jwtTokenService.getUsernameFromToken(jwtToken);

            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(username);

                if (jwtTokenService.validateToken(jwtToken, userDetails)) {
                    UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                    SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
                }
            }
        }
        filterChain.doFilter(request, response);
    }
}

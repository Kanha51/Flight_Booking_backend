package com.example.users.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * The type Jwt token service.
 */
@Component
public class JwtTokenService implements Serializable {
    /**
     * The constant JWT_TOKEN_VALIDITY.
     */
    public static final long JWT_TOKEN_VALIDITY = 500 * 60 * 60;
    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 1L;
    /**
     * The Jwt secret.
     */
    public String JWT_SECRET = "secret";


    /**
     * Generate token string.
     *
     * @param userDetails the user details
     * @return the string
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return Jwts
                .builder()
                .setClaims(claims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY))
                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
                .compact();
    }


    /**
     * Validate token boolean.
     *
     * @param token       the token
     * @param userDetails the user details
     * @return the boolean
     */
    public Boolean validateToken(String token, UserDetails userDetails) {

        String username = getUsernameFromToken(token);
        return (username.equals(userDetails.getUsername()) && !isExpired(token));
    }

    /**
     * Is expired boolean.
     *
     * @param token the token
     * @return the boolean
     */
    private Boolean isExpired(String token) {
        Date expiration = getClaimsFromToken(token, Claims::getExpiration);
        return expiration.before(new Date());
    }

    /**
     * Gets claims from token.
     *
     * @param <T>             the type parameter
     * @param token           the token
     * @param claimsTFunction the claims t function
     * @return the claims from token
     */
    private <T> T getClaimsFromToken(String token, Function<Claims, T> claimsTFunction) {
        final Claims claims = Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJws(token).getBody();
        return claimsTFunction.apply(claims);
    }

    /**
     * Gets username from token.
     *
     * @param token the token
     * @return the username from token
     */
    public String getUsernameFromToken(String token) {
        return getClaimsFromToken(token, Claims::getSubject);
    }
}

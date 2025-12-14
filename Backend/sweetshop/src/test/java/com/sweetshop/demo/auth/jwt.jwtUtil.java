package com.sweetshop.demo.auth.jwt;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import static org.junit.jupiter.api.Assertions.*;

class JwtUtilTest {

    private final JwtUtil jwtUtil = new JwtUtil();

    @Test
    void shouldGenerateToken() {
        String token = jwtUtil.generateToken("testuser");
        assertNotNull(token);
    }

    @Test
    void shouldValidateValidToken() {
        UserDetails userDetails = User.withUsername("testuser")
                .password("password")
                .roles("USER")
                .build();

        String token = jwtUtil.generateToken("testuser");

        boolean isValid = jwtUtil.isTokenValid(token, userDetails);

        assertTrue(isValid);
    }
}

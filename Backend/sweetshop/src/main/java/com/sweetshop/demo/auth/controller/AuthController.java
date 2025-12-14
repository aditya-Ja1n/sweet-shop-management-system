package com.sweetshop.demo.auth.controller;

import com.sweetshop.demo.auth.dto.AuthResponse;
import com.sweetshop.demo.auth.dto.LoginRequest;
import com.sweetshop.demo.auth.dto.RegisterRequest;
import com.sweetshop.demo.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest  registerRequest) {
        return new AuthResponse(authService.register(registerRequest));
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest loginRequest) {
        return new AuthResponse(authService.login(loginRequest));
    }
}

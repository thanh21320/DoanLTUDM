package com.nuce.chatapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/auth")
public interface AuthController {

    // TODO: Implement

    @PostMapping(value = "")
    ResponseEntity<?> authenticateUser();

    @PostMapping(value = "")
    ResponseEntity<?> signupUser();

}

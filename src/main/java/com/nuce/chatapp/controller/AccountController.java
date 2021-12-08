package com.nuce.chatapp.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nuce.chatapp.dto.request.CreateUserRequest;

public class AccountController {

    @PostMapping("/signup")
    public String signUp(@ModelAttribute("user") CreateUserRequest request) {
        return "chat";
    }

}

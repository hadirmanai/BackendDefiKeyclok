package com.example.tp4.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo/")
public class DemoController {

    @GetMapping("/helloUser")
    @PreAuthorize("hasAuthority('ROLE_[client_user]')")
    public String helloUser() {
        return "Hello User!";
    }

    @GetMapping("/helloAdmin")
    @PreAuthorize("hasAuthority('ROLE_[client_admin]')")
    public String helloAdmin() {
        return "Hello Admin!";
    }

    @GetMapping("/profile")
    public Authentication profile(Authentication authentication) {
        return authentication;
    }


}


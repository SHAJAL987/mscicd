package com.accountservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ac/v1")
public class AccountHealthCheck {
    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "Account Service Health is OK !";
    }
}

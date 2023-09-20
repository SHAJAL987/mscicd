package com.cardservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cdr/v1")
public class CardServiceHealthCheck {
    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "Card Service Health is OK !";
    }
    // hello this is comment
}

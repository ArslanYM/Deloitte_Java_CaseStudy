package com.example.fraudservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fraud")
public class FraudController {
    @PostMapping("/check")
    public String checkFraud(@RequestBody String transaction) {
        // Logic to check for fraud
        return "Fraud status: No fraud detected";
    }
}

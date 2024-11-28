package com.example.transactionservice.controller;

import com.example.transactionservice.kafka.TransactionProducer;
import com.example.transactionservice.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionProducer transactionProducer;

    @PostMapping
    public String createTransaction(@RequestBody Transaction transaction) {
        transactionProducer.sendTransaction(transaction);
        return "Transaction sent for processing.";
    }
}

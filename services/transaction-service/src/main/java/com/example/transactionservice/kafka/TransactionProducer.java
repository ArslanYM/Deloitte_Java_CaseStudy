package com.example.transactionservice.kafka;

import com.example.transactionservice.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TransactionProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendTransaction(Transaction transaction) {
        kafkaTemplate.send("transaction-topic", transaction.toString());
        System.out.println("Transaction sent: " + transaction.toString());
    }
}

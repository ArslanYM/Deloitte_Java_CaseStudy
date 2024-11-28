package com.example.fraudservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class FraudDetectionConsumer {

    @KafkaListener(topics = "transaction-topic", groupId = "fraud-detector")
    public void consumeTransaction(String transaction) {
        System.out.println("Received transaction: " + transaction);
        // Add fraud detection logic here
    }
}

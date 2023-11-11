package com.example.memorysupport.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaConsumer {

    @KafkaListener(topics = "memTopic", groupId = "my-group-id",autoStartup = "${listen.auto.start:false}")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}

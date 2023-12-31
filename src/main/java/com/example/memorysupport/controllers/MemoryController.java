package com.example.memorysupport.controllers;

import com.example.memorysupport.services.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class MemoryController {

    private HashMap<String, String> memMap = new HashMap<>();

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @Value("${parrot-name:Zorro}")
    private String nameParrot;

    public MemoryController(
    ) {
        memMap.put("пароль", "pass1");
    }
    @PostMapping("/mem")
    public String getMemory2() {
        return "обратно";
    }
    @PostMapping("/memory")
    ResponseEntity<String> getMemory(@RequestBody String hint) {
        //memoryService.getInfo("newTopic", message);
        return new ResponseEntity<>(memMap.get(hint), HttpStatus.OK);
    }
    @GetMapping("/ping")
    String getBird(){
        return "test1";
    }
    @PostMapping("/kafka/message")
    ResponseEntity<String> sendMessageToKafka(@RequestBody String message) {
        kafkaProducerService.sendMessage("memTopic", message);
        return new ResponseEntity<>("Message sent to Kafka", HttpStatus.OK);
    }
}

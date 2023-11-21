package com.example.memorysupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class  MemorySupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemorySupportApplication.class, args);
    }
}

package com.example.memorysupport.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("user-service")
public interface UserServiceFeighClient {

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);

    /*@PostMapping("/users")
    User createUser(@RequestBody User user);

    @PutMapping("/users/{id}")
    User updateUser(@PathVariable("id") Long id, @RequestBody User user);

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable("id") Long id);*/
}

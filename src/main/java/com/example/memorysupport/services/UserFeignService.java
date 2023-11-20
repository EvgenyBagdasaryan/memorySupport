package com.example.memorysupport.services;

import org.springframework.stereotype.Service;

@Service
public class UserFeignService {

    private final UserServiceFeignClient userServiceClient;

    public UserService(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    public User getUserById(Long id) {
        return userServiceClient.getUserById(id);
    }

    public User createUser(User user) {
        return userServiceClient.createUser(user);
    }

    public User updateUser(Long id, User user) {
        return userServiceClient.updateUser(id, user);
    }

    public void deleteUser(Long id) {
        userServiceClient.deleteUser(id);
    }
}

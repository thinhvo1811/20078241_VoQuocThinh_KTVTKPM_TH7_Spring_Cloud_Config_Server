package com.example.user_service.controllers;


import com.example.user_service.models.User;
import com.example.user_service.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user-service/read")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user-service/create")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}

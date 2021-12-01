package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

     @GetMapping
     public List<User> getUsers() {
         return userRepository.findAll();
     }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }




}

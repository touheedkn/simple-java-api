package com.example.SprintAPI.api.controller;

import com.example.SprintAPI.api.model.User;
import com.example.SprintAPI.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    public  UserController(UserService userService){
        this.userService =  userService;
    }

    @GetMapping("/user")
    public Optional<User> getUser(@RequestParam Integer id){
        return userService.getUser(id);
    }
}

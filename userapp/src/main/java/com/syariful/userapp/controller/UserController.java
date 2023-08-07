package com.syariful.userapp.controller;

import com.syariful.userapp.entity.User;
import com.syariful.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
       return userService.getUsers();
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {

        User userSaved = userService.saveUser(user);
        return userSaved;
    }
}

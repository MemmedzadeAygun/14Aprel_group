package com.example.ComputerShopping.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ComputerShopping.demo.Service.UserService;

import az.developia.spring_project_14aprel.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return userService.register(user);
    }
    
    @GetMapping("/getcount")
    public long getUserCount() {
    	return userService.getUserCount();
    }
}
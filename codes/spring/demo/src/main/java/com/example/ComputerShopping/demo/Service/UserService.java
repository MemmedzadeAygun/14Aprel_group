package com.example.ComputerShopping.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ComputerShopping.demo.Repository.UserRepository;

import az.developia.spring_project_14aprel.entity.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String register(User user) {

        if (userRepository.existsByUsername(user.getName()).isPresent()) {
            return "Username artıq mövcuddur!";
        }

         userRepository.save(user);
         return "Qeydiyyat ugurla basa catdi!";
    }

    public long getUserCount() {
        return userRepository.countAllUsers();
    }
}
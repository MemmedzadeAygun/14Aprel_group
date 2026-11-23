package com.example.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.test.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

}

package com.example.ComputerShopping.demo.Repository;

import java.util.Optional; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.spring_project_14aprel.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> existsByUsername(String username);
	
    @Query(value = "SELECT COUNT(*) FROM users", nativeQuery = true)
    long countAllUsers();
}

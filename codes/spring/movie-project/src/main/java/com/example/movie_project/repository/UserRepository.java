package com.example.movie_project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.movie_project.dto.response.UserResponseDto;
import com.example.movie_project.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);
	//SELECT * FROM users WHERE username="rehman";

	@Query(value = "SELECT u FROM User u")
	List<User> getUsers();

}

package com.example.movie_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie_project.dto.request.UserRequestDto;
import com.example.movie_project.dto.response.UserResponseDto;
import com.example.movie_project.entity.User;
import com.example.movie_project.exception.UserNotFoundException;
import com.example.movie_project.exception.ValidationException;
import com.example.movie_project.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(path = "/add")
	public void addUser(@Valid @RequestBody UserRequestDto dto, BindingResult br) throws UserNotFoundException {
		if (br.hasErrors()) {
			throw new ValidationException(br);
		}
		userService.addUser(dto);
	}
	
	@GetMapping(path = "/{id}", produces = {"application/json", "application/xml"})
	public UserResponseDto getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}
	
	@GetMapping(path = "/findAll")
	@Cacheable(value = "users")
	public List<UserResponseDto> getUsers(){
		System.out.println("Database-den oxundu!");
		return userService.getUsers(); 
	}
} 

package az.developia.spring_project_14aprel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.User;
import az.developia.spring_project_14aprel.exception.ValidationException;
import az.developia.spring_project_14aprel.exception.UserNotFoundException;
import az.developia.spring_project_14aprel.requestDto.UserRequestDto;
import az.developia.spring_project_14aprel.responseDto.UserResponseDto;
import az.developia.spring_project_14aprel.service.UserService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;
	

	@ApiResponse(responseCode = "404",
			description = "Resource not found")
	@ApiResponse(responseCode = "200",
	description = "Resource founded")
	@PostMapping(path = "/add")
	public void addUser(@Valid @RequestBody UserRequestDto dto, BindingResult br) throws ValidationException, UserNotFoundException{
		if (br.hasErrors()) {
			throw new ValidationException(br, "melumatlarin tamliginda problem var!");
		}
		userService.createUser(dto);
	}
	
	@GetMapping(path = "/getUsers")
	public List<User> getUsersByName(@RequestParam(name = "name") String name){
		return userService.getUsers(name);
	}
	
	@DeleteMapping(path = "/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.delete(id);
	}
	
	@GetMapping(path = "/get") 
	public List<UserResponseDto> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUserByName")
	public List<User> getUserByName(@RequestParam(name = "name") String name){
		return userService.getUsersByName(name);
	} 
	
} 

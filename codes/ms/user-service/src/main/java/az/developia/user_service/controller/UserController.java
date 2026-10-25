package az.developia.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.user_service.response.UserListResponse;
import az.developia.user_service.service.UserService;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path = "/getAll")
	public UserListResponse getAllUsers() {
		return userService.getAllUsers(); 
	}
	
	@GetMapping(path = "/user-withBooks")
	public UserListResponse getAllUsersWithBooks() {
		return userService.getAllUsersWithBooks();  
	}
}

package az.developia.spring_project_14aprel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.User;
import az.developia.spring_project_14aprel.service.UserService;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(path = "/add")
	public void addUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@GetMapping(path = "/getUsers")
	public List<User> getUsersByName(@RequestParam(name = "name") String name){
		return userService.getUsers(name);
	}
}

package az.developia.spring_project_14aprel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_14aprel.entity.User;
import az.developia.spring_project_14aprel.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository userRepository;

	public void createUser(User user) {
	    Optional<User> userByUsername = userRepository.findByUsername(user.getUsername());
	    if (userByUsername.isPresent()) {
			throw new RuntimeException("user already exists!");
		}
		userRepository.save(user);
	}

	public List<User> getUsers(String name) { 
		return  userRepository.findByfirstNameContaining(name);
		
	}

	public void delete(Integer id) {
		if (id == null || id <= 0) {
			throw new RuntimeException("id must not be null or less than 0");
		}
		
		Optional<User> byId = userRepository.findById(id);
		
		if (byId.isPresent()) {
			userRepository.deleteById(id);
		}else {
			throw new RuntimeException("id not found");
		}
	}


}

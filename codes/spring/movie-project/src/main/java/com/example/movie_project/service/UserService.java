package com.example.movie_project.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie_project.dto.request.UserRequestDto;
import com.example.movie_project.dto.response.UserResponseDto;
import com.example.movie_project.entity.Movie;
import com.example.movie_project.entity.User;
import com.example.movie_project.exception.ResourcesNotFoundException;
import com.example.movie_project.exception.UserNotFoundException;
import com.example.movie_project.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	public void addUser(UserRequestDto userDto) throws UserNotFoundException {
	    Optional<User> userByUsername = userRepository.findByUsername(userDto.getUsername());
	    if (userByUsername.isPresent()) {
			throw new UserNotFoundException("user already exists!");
		}
	    
	    User user = new User();
//	    user.setName(userDto.getName());
//	    user.setSurname(userDto.getSurname());
//	    user.setAge(userDto.getAge());
//	    user.setEmail(userDto.getEmail());
//	    user.setUsername(userDto.getUsername());
//	    user.setPassword(userDto.getPassword());
	    modelMapper.map(userDto, user);
	    
		userRepository.save(user);
	}

	public UserResponseDto getUser(Integer id) {
		if (id == null || id <= 0) {
			throw new RuntimeException("id null ve ya menfi ola bilmez!");
		}
		
		Optional<User> byId = userRepository.findById(id);
		
		UserResponseDto response = new UserResponseDto();
//		User user = null;
		if (byId.isPresent()) {
			User user = byId.get();
//			response.setId(user.getId());
//			response.setName(user.getName());
//			response.setAge(user.getAge());
//			response.setSurname(user.getSurname());
//			response.setUsername(user.getUsername());
//			response.setEmail(user.getEmail());
			modelMapper.map(user, response);
		}else {
			throw new ResourcesNotFoundException("Bu obyekt movcud deyil!");
		}
		return response;
	}

	public List<UserResponseDto> getUsers() {
		 List<User> users = userRepository.getUsers();

		    return users.stream()
		            .map(user -> new UserResponseDto(
		                    user.getId(),
		                    user.getName(),
		                    user.getSurname(),
		                    user.getAge(),
		                    user.getUsername(),
		                    user.getEmail()
		            ))
		            .toList();
	}
	
}

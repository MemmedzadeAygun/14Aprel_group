package az.developia.spring_project_14aprel.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import az.developia.spring_project_14aprel.entity.Order;
import az.developia.spring_project_14aprel.entity.User;
import az.developia.spring_project_14aprel.repository.UserRepository;
import az.developia.spring_project_14aprel.requestDto.UserRequestDto;
import az.developia.spring_project_14aprel.responseDto.OrderResponseDto;
import az.developia.spring_project_14aprel.responseDto.UserResponseDto;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper mapper;
	

//	public void createUser(User user) {
//	    Optional<User> userByUsername = userRepository.findByUsername(user.getUsername());
//	    if (userByUsername.isPresent()) {
//			throw new RuntimeException("user already exists!");
//		}
//	    
//	    if (user.getOrders() != null) {
//			for (Order order : user.getOrders()) {
//				order.setUser(user);
//			}
//		}
//	    
//	    
//		userRepository.save(user);
//	}
	
	public void createUser(UserRequestDto dto) {
	    Optional<User> userByUsername = userRepository.findByUsername(dto.getUsername());
	    if (userByUsername.isPresent()) {
			throw new RuntimeException("user already exists!");
		}
	    
	    User user = new User();
	    
	    mapper.map(dto, user);
	    
		userRepository.save(user);
	}
	
	

	public List<User> getUsers(String name) { 
		return  userRepository.findByfirstNameContaining(name);
		
	}

	@Transactional
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

	public List<UserResponseDto> getAllUsers() {
		
		return userRepository.findUsers()
				.stream()
				.map(user -> {
				  List<OrderResponseDto> orders = user.getOrders()
					.stream()
					.map(order -> new OrderResponseDto(
							order.getId(),
							order.getOrderDate(),
							order.getStatus()
							))
					.toList();
					
					return new UserResponseDto(
							user.getId(),
							user.getFirstName(),
							user.getLastName(),
							user.getUsername(),
							user.getEmail(),
							user.getPassword(),
							orders
							);
				})
				.toList();
				
	}

	public List<User> getUsersByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByName(name);
	}


}

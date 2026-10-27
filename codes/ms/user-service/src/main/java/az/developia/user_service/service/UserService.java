package az.developia.user_service.service;

import java.util.ArrayList;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import az.developia.user_service.entity.User;
import az.developia.user_service.repository.UserRepository;
import az.developia.user_service.response.BookListResponse;
import az.developia.user_service.response.UserListResponse;
import az.developia.user_service.response.UserResponse;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public UserListResponse getAllUsers() {
		UserListResponse resp = new UserListResponse();
		List<User> all = userRepository.findAll();
		resp.setUserListResponse(all);
		return resp;
	}

	public UserListResponse getAllUsersWithBooks() {
		UserListResponse resp = new UserListResponse();
		
		
		ArrayList<UserResponse> userResp = new ArrayList<UserResponse>();
		
		List<User> users = userRepository.findAll();
		for (User user : users) {
			UserResponse userResponse = new UserResponse();
			userResponse.setId(user.getId());
			userResponse.setFirstName(user.getFirstName());
			userResponse.setLastName(user.getLastName());
			userResponse.setAge(user.getAge());
			 
			BookListResponse bookListResponse = restTemplate.getForObject("http://book-service/books/user/" + user.getId(), BookListResponse.class);
			
			userResponse.setBookResponse(bookListResponse.getBookListResponse());
			userResp.add(userResponse);
		}
		
		resp.setUserListResponseWithBooks(userResp);
		return resp;
	} 

	
	
	
}

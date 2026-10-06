package az.developia.spring_project_14aprel.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import az.developia.spring_project_14aprel.exception.UserNotFoundException;
import az.developia.spring_project_14aprel.repository.UserRepository;
import az.developia.spring_project_14aprel.requestDto.UserRequestDto;

@SpringBootTest
@ActiveProfiles("dev")
public class UserServiceTest {

	@Autowired
	private UserService service;
	
	@Test
	void should_createUser() throws UserNotFoundException {
		UserRequestDto dto = new UserRequestDto();
		dto.setFirstName("Adil");
		dto.setLastName("Memmedov");
		dto.setAge(26);
		dto.setEmail("adil@gmail.com");
		dto.setUsername("adil");
		dto.setPassword("1234");
		
		service.createUser(dto);
	}
}

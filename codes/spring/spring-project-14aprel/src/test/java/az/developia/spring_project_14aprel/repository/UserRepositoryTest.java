package az.developia.spring_project_14aprel.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import az.developia.spring_project_14aprel.entity.User;

@SpringBootTest
@ActiveProfiles("dev")
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	@Transactional
	void test_userCreate() {
		User user = new User();
//		user.setId(1);
		user.setFirstName("Xedice");
		user.setLastName("Novruzova");
		
		userRepository.save(user);
	}

}

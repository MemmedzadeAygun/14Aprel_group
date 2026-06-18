package az.developia.spring_project_14aprel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project_14aprel.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
	
	Optional<User> findByUsernameOrEmail(String username, String email);

	List<User> findByfirstNameContaining(String name);


}

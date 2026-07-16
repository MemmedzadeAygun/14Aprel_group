package az.developia.spring_project_14aprel.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import az.developia.spring_project_14aprel.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
	
	Optional<User> findByUsernameOrEmail(String username, String email);

	List<User> findByfirstNameContaining(String name);

	@Query(value = "SELECT u from User u")
	List<User> findUsers();
	
	@Query(value = "Select u from User u WHERE u.firstName = :name")
	List<User> findByName(@Param(value = "name") String name);
 
}

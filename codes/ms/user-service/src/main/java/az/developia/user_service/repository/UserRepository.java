package az.developia.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.user_service.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

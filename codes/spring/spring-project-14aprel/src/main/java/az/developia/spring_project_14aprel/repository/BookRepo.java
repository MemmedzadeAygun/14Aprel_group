package az.developia.spring_project_14aprel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project_14aprel.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}

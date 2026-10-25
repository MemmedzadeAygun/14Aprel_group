package az.developia.book_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.book_service.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	List<Book> findAllByUserId(Integer userId);

}

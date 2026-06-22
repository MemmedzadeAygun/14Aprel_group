package az.developia.spring_project_14aprel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import az.developia.spring_project_14aprel.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

//	@Query(value = "SELECT * FROM book WHERE author= :author;", nativeQuery = true)
	@Query(value = "SELECT b FROM Book b WHERE b.author= :author")
	List<Book> findBooksByAuthor(@Param(value = "author") String author);

	@Modifying
	@Transactional
	@Query(value = "delete from book WHERE id=:id", nativeQuery = true) 
//	@Query(value = "delete from Book b WHERE b.id=:id", nativeQuery = true)
	void deleteBookNative(@Param(value = "id") Integer id);

}

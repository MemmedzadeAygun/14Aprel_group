package az.developia.spring_project_14aprel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getBooks(String name, String year) {
		return bookRepository.getBooks(name, year);
	}

	public Book getBook(Integer id) {
		
		return bookRepository.getBook(id);
	}

	public String addBook(Book book) {
		bookRepository.addBook(book);
		return "Kitab ugurla qeydiyyat edildi!";
	}
 
	public void deleteBook(Integer id) {
		bookRepository.deleteBook(id); 
	}

	public String updateBook(Book book) {
		if (book.getId() == null || book.getId() <= 0) {
			throw new IllegalArgumentException("id must not be null or less than 0");
		}
		
		Optional<Book> bookById = bookRepository.getBookById(book.getId());
		if (bookById.isPresent()) {
			bookRepository.update(book);
		}else {
			throw new IllegalArgumentException("id not found");
		}
		
		return "Book updated successfully!";
	}


}

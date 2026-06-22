package az.developia.spring_project_14aprel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.repository.BookRepo;
import az.developia.spring_project_14aprel.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookRepo bookRepo;

	public List<Book> getBooks(String name, String year) {
		return bookRepository.getBooks(name, year);
	}
	
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}
	

	public Optional<Book> getBook(Integer id) {
		
		return bookRepo.findById(id);
	}

	public String addBook(Book book) {
		bookRepo.save(book);
		return "Kitab ugurla qeydiyyat edildi!";
	}
 
	public void deleteBook(Integer id) {
		if (bookRepo.findById(id).isPresent()) {
//			bookRepo.deleteById(id); 
			bookRepo.deleteBookNative(id);  
		}else {
			throw new IllegalArgumentException("id not found");
		}
		 
	}

	public String updateBook(Book book) {
		if (book.getId() == null || book.getId() <= 0) {
			throw new IllegalArgumentException("id must not be null or less than 0");
		}
		
		Optional<Book> bookById = bookRepo.findById(book.getId());
		if (bookById.isPresent()) {
			bookRepo.save(book);
		}else {
			throw new IllegalArgumentException("id not found");
		}
		
		return "Book updated successfully!";
	}

	public List<Book> findBooksByAuthor(String author) { 
		
		return bookRepo.findBooksByAuthor(author);
	}


}

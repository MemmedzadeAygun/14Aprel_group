package az.developia.spring_project_14aprel.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.service.BookService;

@RestController
@RequestMapping(path = "/api/books")
@CrossOrigin(origins = "*")
public class BookController2 {
	
	@Autowired
	private BookService bookService;
	

	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping(path = "/getBooks")
	public List<Book> getBooks(@RequestParam(name = "name", required = false) String name,
	@RequestParam(name = "year", required = false) String year) {

		return bookService.getBooks(name, year);
	}
	
	@ResponseStatus(code = HttpStatus.OK)
	@GetMapping(path = "/findAll")
	public List<Book> getBooks() {

		return bookService.getBooks();
	}


	@GetMapping(path = "/getBook/{id}")
	public Optional<Book> getBook(@PathVariable Integer id) {
	
		return bookService.getBook(id);
	}

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping(path = "/addBook")
	public String addBook(@RequestBody Book book) {

		return bookService.addBook(book);
	}
	
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@DeleteMapping(path = "/book/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
	
	@PutMapping(path = "/update")
	public String updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@GetMapping
	public List<Book> findBooksByAuthor(@RequestParam(name = "q") String author){
		return bookService.findBooksByAuthor(author);
	}
	
}

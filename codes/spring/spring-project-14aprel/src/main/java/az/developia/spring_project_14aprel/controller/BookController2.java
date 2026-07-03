package az.developia.spring_project_14aprel.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
import az.developia.spring_project_14aprel.requestDto.BookRequestDto;
import az.developia.spring_project_14aprel.responseDto.BookListResponseDto;
import az.developia.spring_project_14aprel.responseDto.BookResponseDto;
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
	public BookListResponseDto getBooks() {

		return bookService.getBooks();
	}
	
	////api/books/pagination/begin/0/length/10"
	@GetMapping(path = "/pagination/begin/{begin}/length/{length}") 
	public List<Book> pagination(@PathVariable Integer begin, @PathVariable Integer length) {
		
		return bookService.pagination(begin, length);
	}
	
	@GetMapping(path = "/pagination") 
	public Page<Book> pagination2(@RequestParam(name = "page") Integer page,
			@RequestParam(name = "size") Integer size) {
		
		PageRequest pagable = PageRequest.of(page, size);
		
		return bookService.pagination2(pagable);
	}

	@GetMapping(path = "/getBook/{id}")
	public BookResponseDto getBook(@PathVariable Integer id) {
	
		return bookService.getBook(id);
	}
	

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping(path = "/addBook")
	public String addBook(@RequestBody BookRequestDto dto) {

		return bookService.addBook(dto);
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

package az.developia.book_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.book_service.response.BookListResponse;
import az.developia.book_service.service.BookService;

@RestController
@RequestMapping(path = "/books")
@CrossOrigin(origins = "*")
public class BookController {
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	private BookService bookService;

	@GetMapping(path = "/user/{userId}")
	private BookListResponse getAllBooksById(@PathVariable Integer userId) {
		System.out.println("Servisden gelen data = " + port);
		return bookService.getAllBooks(userId);
	}
}

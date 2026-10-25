package az.developia.book_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired
	private BookService bookService;

	@GetMapping(path = "/user/{userId}")
	private BookListResponse getAllBooksById(@PathVariable Integer userId) {
		return bookService.getAllBooks(userId);
	}
}

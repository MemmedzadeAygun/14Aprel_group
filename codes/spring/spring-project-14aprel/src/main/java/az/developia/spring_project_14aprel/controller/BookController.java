package az.developia.spring_project_14aprel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import az.developia.spring_project_14aprel.entity.Book;

@Controller
public class BookController {
	
	List<Book> books = new ArrayList<Book>(List.of(
				new Book(1,"Sefiller", 1987),
				new Book(2,"Harry Potter", 2001)
			));
	
//	@GetMapping(path = "/kitablar")
//	public String getBooks() {  
//		return "books";
//	}
	
	@GetMapping(path = "/kitablar")
	public String getBooks(Model model) {  
		model.addAttribute("books", books);
		return "books";
	}
	
	@PostMapping(path = "/add")
	public String addBook(Book book) {
		books.add(book);
		return "redirect:/kitablar";
	}
}

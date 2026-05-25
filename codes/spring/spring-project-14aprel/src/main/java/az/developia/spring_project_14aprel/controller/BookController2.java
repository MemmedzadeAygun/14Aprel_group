package az.developia.spring_project_14aprel.controller;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.Book;

@RestController
public class BookController2 {

	@GetMapping(path = "/getBooks")
	public List<Book> getBooks(){
		List<Book> books = new ArrayList<Book>();
		books.addLast(new Book("Sefiller", 1980));
		books.addLast(new Book("Kozetta", 1985));
		books.addLast(new Book("Ag Zanbaqlar", 1986));
		return books;
	}
	
	
	@PostMapping(path = "/addBook")
	public String addBook(@RequestBody Book book) {
		System.out.println(book);
		return "Kitab ugurla elave edildi!";
	}
}

package az.developia.book_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.book_service.entity.Book;
import az.developia.book_service.repository.BookRepository;
import az.developia.book_service.response.BookListResponse;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public BookListResponse getAllBooks(Integer userId) {
	
		BookListResponse response = new BookListResponse();
		List<Book> all = bookRepository.findAllByUserId(userId);
		response.setBookListResponse(all);
		return response;
	}

}

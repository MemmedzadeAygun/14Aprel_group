package az.developia.book_service.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.book_service.entity.Book;
import az.developia.book_service.repository.BookRepository;
import az.developia.book_service.response.BookListResponse;

@Service
public class BookService {
	
	private static final Logger log = LoggerFactory.getLogger(BookService.class);
	
	@Autowired
	private BookRepository bookRepository;
	

	public BookListResponse getAllBooks(Integer userId) {
		
		log.info("Kitablarin qaytarilmasi ile bagli method.");
	
		BookListResponse response = new BookListResponse();
		List<Book> all = bookRepository.findAllByUserId(userId);
		response.setBookListResponse(all);
		return response;
	}

}

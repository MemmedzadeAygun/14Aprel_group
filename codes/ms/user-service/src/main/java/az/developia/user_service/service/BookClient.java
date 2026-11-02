package az.developia.user_service.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import az.developia.user_service.response.BookListResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@Service
public class BookClient {

	@Autowired
	private RestTemplate restTemplate;
	
	@Retry(name = "book-service")
	@CircuitBreaker(name = "book-service", fallbackMethod = "bookFallback")
	public BookListResponse getBooks(Integer userId) {
		return restTemplate.getForObject("http://book-service/books/user/" + userId, BookListResponse.class);
	}
	
	public BookListResponse bookFallback(Integer userId, Throwable exc) {
		
		System.out.println("BookService unavailable: " + exc.getMessage());
		
		BookListResponse response = new BookListResponse();
		response.setBookListResponse(new ArrayList<>());
		return response;
	}
}

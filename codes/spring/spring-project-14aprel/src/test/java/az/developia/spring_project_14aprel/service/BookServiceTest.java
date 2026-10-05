package az.developia.spring_project_14aprel.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.repository.BookRepo;
import az.developia.spring_project_14aprel.responseDto.BookResponseDto;
import az.developia.spring_project_14aprel.service.BookService;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
	
	@Mock
	private BookRepo bookRepo;
	
	@InjectMocks
	private BookService bookService;
	
	@Mock
	private ModelMapper mapper;
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Her metoddan evvel isleyir");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Her metoddan sonra isleyir");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Butun metodlardan evvel");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Butun metodlardan sonra");
	}

	@Test
	void shouldCalculatePrice() {
		BookService book = new BookService();
		double result = book.calculatePrice(10, 3);
		assertEquals(30, result);
	}
	
	
	@Test
	void sholdTestWhenReturnTrue() {
		BookService book = new BookService();
		boolean available = book.isAvailable(12);
//		boolean available = book.isAvailable(-8);
		assertTrue(available);
	}
	
	@Test
	void getBookInfo() {
		Book book = new Book();
		book.setId(1);
		
		when(bookRepo.findById(1))
		.thenReturn(Optional.of(book));
		
		BookResponseDto response = bookService.getBook(1);
		
		assertNotNull(response);
		
		verify(bookRepo).findById(1);
	}
}

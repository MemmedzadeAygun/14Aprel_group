package az.developia.spring_project_14aprel.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.cache.CacheManager;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import az.developia.spring_project_14aprel.requestDto.BookRequestDto;
import az.developia.spring_project_14aprel.responseDto.BookResponseDto;
import az.developia.spring_project_14aprel.service.BookService;
import az.developia.spring_project_14aprel.util.JwtUtil;

@WebMvcTest(BookController2.class)
public class BookControllerTest {

	@MockitoBean
	private BookService bookService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockitoBean
	private JwtUtil jwtUtil;
	
	@MockitoBean
	private CacheManager cacheManager;
	
	@Test
	void getBookById_shouldReturnWhenIsOk() throws Exception {
		BookResponseDto responseDto = mock(BookResponseDto.class);
		
		when(bookService.getBook(1)).thenReturn(responseDto);
		
		mockMvc.perform(get("/api/books/getBook/1")).andExpect(status().isOk());
		
		verify(bookService).getBook(1);
	}
	
	@Test
	void addBook_shouldReturnCreated() throws Exception {
		BookRequestDto dto = new BookRequestDto();
		
		when(bookService.addBook(any(BookRequestDto.class))).thenReturn("Book added sucessfully");
		
		mockMvc.perform(post("/api/books/addBook").contentType(MediaType.APPLICATION_JSON)
				.content("""
						{
							"name": "Java",
							"year": "1995",
							"author": "James Gosling"
						}
						""")
						)
				.andExpect(status().isCreated());
	}
}

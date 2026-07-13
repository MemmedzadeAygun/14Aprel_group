package az.developia.spring_project_14aprel.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.repository.BookRepo;
import az.developia.spring_project_14aprel.repository.BookRepository;
import az.developia.spring_project_14aprel.requestDto.BookRequestDto;
import az.developia.spring_project_14aprel.responseDto.BookListResponseDto;
import az.developia.spring_project_14aprel.responseDto.BookResponseDto;
import jakarta.persistence.EntityManager;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookRepo bookRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private EntityManager entityManager;


	public List<Book> getBooks(String name, String year) {
		return bookRepository.getBooks(name, year);
	}
	
	public BookListResponseDto getBooks() {
		List<Book> all = bookRepo.findAll();
		BookListResponseDto dto = new BookListResponseDto();
		dto.setBooks(all);
		dto.setColor("Red");
		return dto;
	}
	
	

//	obyekt -> entity -> dto object
	public BookResponseDto getBook(Integer id) {
		if (id == null || id <= 0) {
			throw new RuntimeException("id must not be null or less than 0");
		}
		
		Optional<Book> byId = bookRepo.findById(id);
		
		BookResponseDto dto = new BookResponseDto();
		if (byId.isPresent()) {
			Book book = byId.get();
			modelMapper.map(book, dto);
		}
		return dto;
	}
	


//	obyekt -> dto obyekt -> entity object
	public String addBook(BookRequestDto d) {
		Book book = new Book();
		modelMapper.map(d, book);
		bookRepo.save(book);
		return "Kitab ugurla qeydiyyat edildi!";
	}
	
 
	public void deleteBook(Integer id) {
		if (bookRepo.findById(id).isPresent()) {
//			bookRepo.deleteById(id); 
			bookRepo.deleteBookNative(id);  
		}else {
			throw new IllegalArgumentException("id not found");
		}
		 
	}

	public String updateBook(Book book) {
		if (book.getId() == null || book.getId() <= 0) {
			throw new IllegalArgumentException("id must not be null or less than 0");
		}
		
		Optional<Book> bookById = bookRepo.findById(book.getId());
		entityManager.detach(bookById);
		entityManager.merge(bookById);
		if (bookById.isPresent()) {
			bookRepo.save(book);
		}else {
			throw new IllegalArgumentException("id not found");
		}
		
		return "Book updated successfully!";
	}

	public List<Book> findBooksByAuthor(String author) { 
		
		return bookRepo.findBooksByAuthor(author);
	}

	public List<Book> pagination(Integer begin, Integer length) {
	
		return bookRepo.pagination(begin, length);
	}

	public Page<Book> pagination2(PageRequest pagable) {
		
		return bookRepo.findAll(pagable);
	}

	


}

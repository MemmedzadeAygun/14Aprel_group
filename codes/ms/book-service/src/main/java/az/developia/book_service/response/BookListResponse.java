package az.developia.book_service.response;

import java.util.List;

import az.developia.book_service.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookListResponse {

	private List<Book> bookListResponse;
}

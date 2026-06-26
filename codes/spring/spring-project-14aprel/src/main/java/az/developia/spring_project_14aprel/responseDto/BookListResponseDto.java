package az.developia.spring_project_14aprel.responseDto;

import java.util.List;

import az.developia.spring_project_14aprel.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookListResponseDto {

	private List<Book> books;
	private String color;
}

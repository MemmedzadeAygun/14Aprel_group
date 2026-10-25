package az.developia.user_service.response;

import java.util.List;

import lombok.Data;

@Data
public class BookListResponse {
	private List<BookResponse> bookListResponse;
}

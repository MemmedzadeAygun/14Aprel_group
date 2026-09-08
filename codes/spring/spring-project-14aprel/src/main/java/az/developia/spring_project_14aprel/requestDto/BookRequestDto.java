package az.developia.spring_project_14aprel.requestDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Book Request Dto", description = "Request Dto sinifi")
public class BookRequestDto {
	private String name;
	private Integer year;
	private String author;
}

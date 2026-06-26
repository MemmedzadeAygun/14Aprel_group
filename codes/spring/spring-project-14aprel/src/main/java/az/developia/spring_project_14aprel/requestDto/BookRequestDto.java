package az.developia.spring_project_14aprel.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto {
	private String name;
	private Integer year;
	private String author;
}

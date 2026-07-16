package az.developia.spring_project_14aprel.responseDto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto {
	private Integer id;
	private LocalDateTime orderDate;
	private String status;
}

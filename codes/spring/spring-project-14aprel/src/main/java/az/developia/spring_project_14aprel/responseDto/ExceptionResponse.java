package az.developia.spring_project_14aprel.responseDto;

import java.util.List;

import org.springframework.validation.FieldError;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
	private String message;
	private List<ValidationResponse> validationResponse;
//	private List<FieldError> validationResponse;
}

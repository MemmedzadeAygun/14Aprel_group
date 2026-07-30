package az.developia.spring_project_14aprel.responseDto;

import lombok.Data;

@Data
public class ErrorResponse {
	private String message;
	private int status;
	private String path;
}

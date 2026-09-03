package az.developia.spring_project_14aprel.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_project_14aprel.exception.ValidationException;
import az.developia.spring_project_14aprel.exception.ResourcesNotFoundException;
import az.developia.spring_project_14aprel.exception.UserNotFoundException;
import az.developia.spring_project_14aprel.responseDto.ErrorResponse;
import az.developia.spring_project_14aprel.responseDto.ExceptionResponse;
import az.developia.spring_project_14aprel.responseDto.ValidationResponse;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandlers {
	
	@ExceptionHandler
	public ExceptionResponse handle(ValidationException exc) {
//		return exc.getB().getFieldErrors().get(0).getDefaultMessage(); 
		ExceptionResponse response = new ExceptionResponse();
		BindingResult b = exc.getB();
		if (b == null) {
			
		}else {
			List<FieldError> fieldErrors = b.getFieldErrors();
			ArrayList<ValidationResponse> validations = new ArrayList<ValidationResponse>();
			for (FieldError error : fieldErrors) {
				ValidationResponse validation = new ValidationResponse();
				validation.setField(error.getField());
				validation.setFieldMessage(error.getDefaultMessage());
				validations.add(validation);
			}
			response.setValidationResponse(validations);
//			response.setValidationResponse(fieldErrors);
		}
		
		response.setMessage(exc.getMessage());
		
		return response;
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> handle(UserNotFoundException ex){
//		return ResponseEntity.status(404).body(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
	}

	@ExceptionHandler(ResourcesNotFoundException.class)
	public ResponseEntity<?> handle(ResourcesNotFoundException ex, HttpServletRequest request){
		
		ErrorResponse error = new ErrorResponse();
		error.setMessage(ex.getMessage());
		error.setStatus(404);
		error.setPath(request.getRequestURI());
		
		return ResponseEntity.badRequest().body(error);
	}
}

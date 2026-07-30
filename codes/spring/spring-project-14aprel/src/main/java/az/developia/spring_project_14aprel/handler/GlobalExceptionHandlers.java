package az.developia.spring_project_14aprel.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_project_14aprel.exception.OurRuntimeException;
import az.developia.spring_project_14aprel.exception.ResourcesNotFoundException;
import az.developia.spring_project_14aprel.exception.UserNotFoundException;
import az.developia.spring_project_14aprel.responseDto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandlers {
	
	@ExceptionHandler
	public String handle(OurRuntimeException exc) {
		return exc.getB().getFieldErrors().get(0).getDefaultMessage(); 
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

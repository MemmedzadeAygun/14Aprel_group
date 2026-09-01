package com.example.movie_project.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.movie_project.dto.response.ErrorResponse;
import com.example.movie_project.exception.ResourcesNotFoundException;
import com.example.movie_project.exception.UserNotFoundException;
import com.example.movie_project.exception.ValidationException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandlers {
	
	@ExceptionHandler
	public String handle(ValidationException exc) {
		return exc.getBr().getFieldErrors().get(0).getDefaultMessage();
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> handle(UserNotFoundException exc) {
//		return ResponseEntity.status(400).body(exc.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exc.getMessage());
	}
	
	@ExceptionHandler(ResourcesNotFoundException.class)
	public ResponseEntity<ErrorResponse> handle(ResourcesNotFoundException exc, HttpServletRequest request) {
		
		ErrorResponse response = new ErrorResponse();
		response.setMessage(exc.getMessage());
		response.setStatus(404);
		response.setPath(request.getRequestURI());

		return ResponseEntity.status(404).body(response);
	}

}

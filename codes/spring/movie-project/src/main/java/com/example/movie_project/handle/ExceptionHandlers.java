package com.example.movie_project.handle;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.movie_project.exception.OurRuntimeException;

@RestControllerAdvice
public class ExceptionHandlers {
	
	@ExceptionHandler
	public String handle(OurRuntimeException exc) {
		return exc.getBr().getFieldErrors().get(0).getDefaultMessage();
	}

}

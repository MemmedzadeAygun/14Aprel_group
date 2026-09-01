package com.example.movie_project.exception;

import org.springframework.validation.BindingResult;

public class ValidationException extends RuntimeException{

	private BindingResult br;
	
	public ValidationException(BindingResult br) {
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}
	
}

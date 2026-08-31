package com.example.movie_project.exception;

import org.springframework.validation.BindingResult;

public class OurRuntimeException extends RuntimeException{

	private BindingResult br;
	
	public OurRuntimeException(BindingResult br) {
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}
	
}

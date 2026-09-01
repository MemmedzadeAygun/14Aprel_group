package com.example.movie_project.exception;

public class ResourcesNotFoundException extends RuntimeException{

	public ResourcesNotFoundException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}

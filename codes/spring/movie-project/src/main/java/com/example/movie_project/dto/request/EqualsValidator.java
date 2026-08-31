package com.example.movie_project.dto.request;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EqualsValidator implements ConstraintValidator<Equals, String>{
	
	private String otherData;
	
	@Override
	public void initialize(Equals data) {
		this.otherData = data.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;
		if (value != null || !value.isEmpty()) {
			result = value.equalsIgnoreCase(otherData);
			
		}else {
			return false;
		}
		return result;
	}
	

}

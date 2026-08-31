package com.example.movie_project.dto.request;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = EqualsValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Equals {

	public String value() default "eli";
	public String message() default "ad eli olmalidir";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}

package az.developia.spring_project_14aprel.requestDto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = EqualityValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Equality {

	 public String value() default "nermin";
	 public String message() default "username uygun deyil";
	 Class<?>[] groups() default {};
	 Class<? extends Payload>[] payload() default {};
}

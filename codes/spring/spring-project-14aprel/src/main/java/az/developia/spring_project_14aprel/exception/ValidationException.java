package az.developia.spring_project_14aprel.exception;

import org.springframework.validation.BindingResult;


public class ValidationException extends RuntimeException{

	private BindingResult b;
	
	public ValidationException(BindingResult br, String message) {
		super(message);
		this.b = br;
	}
	
	public BindingResult getB() {
		return b;
	}
	
}

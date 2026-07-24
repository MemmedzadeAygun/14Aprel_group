package az.developia.spring_project_14aprel.exception;

import org.springframework.validation.BindingResult;


public class OurRuntimeException extends RuntimeException{

	private BindingResult b;
	
	public OurRuntimeException(BindingResult br) {
		super();
		this.b = br;
	}
	
	public BindingResult getB() {
		return b;
	}
	
}

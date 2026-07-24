package az.developia.spring_project_14aprel.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import az.developia.spring_project_14aprel.exception.OurRuntimeException;

@RestControllerAdvice
public class ExecptionHandlers {
	
	@ExceptionHandler
	public String handle(OurRuntimeException exc) {
		return exc.getB().getFieldErrors().get(0).getDefaultMessage(); 
	}

}

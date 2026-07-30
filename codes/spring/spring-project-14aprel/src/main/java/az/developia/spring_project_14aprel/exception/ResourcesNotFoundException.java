package az.developia.spring_project_14aprel.exception;

public class ResourcesNotFoundException extends RuntimeException{
	
	private String message;

	public ResourcesNotFoundException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}

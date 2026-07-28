package az.developia.spring_project_14aprel.requestDto;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EqualityValidator implements ConstraintValidator<Equality, String> {
	
	private String otherData;
	
	@Override
	public void initialize(Equality data) {
		this.otherData = data.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;
		if (value != null && !value.isEmpty()) {
			result = value.equals(otherData);
		}else {
			return false;
		}
		return result;
	}

}

package az.developia.spring_project_14aprel.requestDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
	
	@NotBlank(message = "ad bos ola bilmez")
	@Size(min = 3, max = 20, message = "Ad min 3, max 20 ola biler")
	private String firstName; 
	
	@NotBlank(message = "soyad bos ola bilmez")
	@Size(min = 3, max = 20, message = "Soyad min 3, max 20 ola biler")
	private String lastName;
	
	@NotBlank(message = "istifadeci adi bos ola bilmez")
	@Size(min = 3, max = 20, message = "username min 3, max 20 ola biler")
	private String username;
	
	@Email
	@NotBlank
	@NotNull
	private String email;
	
	@NotBlank
	private String password;
	
	@NotBlank
	@Min(value = 18, message = "yas min 18 ola biler")
	@Max(value = 25)
	private Integer age;
}

package com.example.movie_project.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto {
	private Integer id;
	
	@Size(min = 3, max = 20, message = "ad min 3, max 20 simvol ola biler.")
	private String name;
	
	@Size(min = 5, max = 20, message = "soyad min 3, max 20 simvol ola biler.")
	private String surname;
	
	@Min(value = 18, message = "yas min 18 ola biler")
	@Max(value = 25, message = "yas max 25 ola biler")
	private Integer age;
	
	@NotBlank
	@NotNull
	@Equals(value = "rehman", message = "ad rehman olmalidir")
//	@Equals
	private String username;
	
	@NotBlank
	@NotNull
//	@Pattern(regexp = "")
	private String password;
	
	@Email
	private String email;
}

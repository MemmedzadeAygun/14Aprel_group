package com.example.movie_project.dto.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto implements Serializable{
	private Integer id;
	private String name;
	private String surname;
	private Integer age;
	private String username;
	private String email;
}

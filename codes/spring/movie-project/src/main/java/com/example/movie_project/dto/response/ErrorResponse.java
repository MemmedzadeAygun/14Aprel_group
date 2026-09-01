package com.example.movie_project.dto.response;

import lombok.Data;

@Data
public class ErrorResponse {
	private String message;
	private String path;
	private Integer status;
}

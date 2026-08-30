package com.example.movie_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MovieProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieProjectApplication.class, args);
	}

}

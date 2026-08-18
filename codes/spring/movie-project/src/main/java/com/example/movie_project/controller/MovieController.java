package com.example.movie_project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie_project.entity.Movie;
import com.example.movie_project.service.MovieService;

@RestController
@RequestMapping(path = "/movies")
public class MovieController {
//	localhost:8089/movies/add
//	localhost:8089/users/add
	
	@Autowired
	private MovieService movieService;

	@PostMapping("/add")
	public String add(@RequestBody Movie movie) {
		return movieService.add(movie);
	}
	
	@GetMapping("/getAll")
	public List<Movie> getAll(){
		return movieService.getAllMovies();
	}
	
	@GetMapping("/get/{id}")
	public Movie get(@PathVariable Integer id) {
		return movieService.getMovie(id);
	}
}

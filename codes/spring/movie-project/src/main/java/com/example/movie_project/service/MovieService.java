package com.example.movie_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie_project.entity.Movie;
import com.example.movie_project.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	public String add(Movie movie) {
		movieRepository.save(movie);
		return "Ugurlu qeydiyyat!";
	}

	public List<Movie> getAllMovies() {
		
		return movieRepository.findAll();
	}

	public Movie getMovie(Integer id) {
		
		if (id == null || id <= 0) {
			throw new RuntimeException("id null ve ya menfi ola bilmez!");
		}
		
		Optional<Movie> byId = movieRepository.findById(id);
		
		Movie movie = null;
		if (byId.isPresent()) {
			movie = byId.get();
		}else {
			throw new RuntimeException("Bu obyekt movcud deyil!");
		}
		
		return movie;
	}

}

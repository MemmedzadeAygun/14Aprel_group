package com.example.movie_project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.movie_project.entity.Movie;
import com.example.movie_project.repository.MovieRepository;

import jakarta.persistence.EntityManager;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private EntityManager em;

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

	public void delete(Integer id) {
		if (id == null || id <= 0) {
			throw new RuntimeException("id null ve ya menfi ola bilmez!");
		}
		
		Optional<Movie> byId = movieRepository.findById(id);
		
		
		if (byId.isPresent()) {
//			em.detach(byId);
			movieRepository.deleteById(id);
		}else {
			throw new RuntimeException("Bu id-de obyekt movcud deyil!");
		}
	}

	public String update(Movie movie) {
		if (movie.getId() == null || movie.getId() <= 0) {
			throw new RuntimeException("id null ve ya menfi ola bilmez!");
		}
		
		Optional<Movie> byId = movieRepository.findById(movie.getId());
		
		if (byId.isPresent()) {
			Movie movie2 = byId.get();
			movie2.setImdb(movie.getImdb());
			movie2.setMovieDate(movie.getMovieDate());
			movie2.setName(movie.getName());
			movieRepository.save(movie2);
			
		}else {
			throw new RuntimeException("Bu id-de obyekt movcud deyil!");
		}
		return "Ugurla update edildi!";
	}

	public List<Movie> findMoviesByName(String movieName) {
		List<Movie> movies =  movieRepository.findMoviesByName(movieName);
		return movies;
	}

	public List<Movie> pagination(Integer begin, Integer length) {
		
		return movieRepository.pagabale(begin, length);
	}

	public Page<Movie> pageable(PageRequest pageable) {
		
		return movieRepository.findAll(pageable);
	}

}

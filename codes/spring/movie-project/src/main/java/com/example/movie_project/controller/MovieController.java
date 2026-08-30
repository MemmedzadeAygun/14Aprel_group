package com.example.movie_project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	 
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Integer id) {
		movieService.delete(id);
	}
	
	@PutMapping(path = "/update") 
	public String update(@RequestBody Movie movie) {
		return movieService.update(movie);
	}
	
	@GetMapping(path = "/all")
	public List<Movie> getAllMovies(@RequestParam(name = "name") String movieName){
		return movieService.findMoviesByName(movieName);
	}
	
//	/movies/pagination/begin/0/length/10
	@GetMapping(path = "/pagination/begin/{begin}/length/{length}")
	public List<Movie> pagination(@PathVariable Integer begin, @PathVariable Integer length){
		return movieService.pagination(begin, length);
	}
	
	@GetMapping(path = "/{page}/{size}")
	public Page<Movie> pageable(@PathVariable(name = "page") Integer page, @PathVariable(name = "size") Integer size){
		PageRequest pageable = PageRequest.of(page, size);
		
		return movieService.pageable(pageable);
	}

}

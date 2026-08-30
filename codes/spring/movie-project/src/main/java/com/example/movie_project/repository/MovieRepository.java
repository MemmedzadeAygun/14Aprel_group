package com.example.movie_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.movie_project.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	@Query(name = "SELECT * FROM movies WHERE name= :name;", nativeQuery = true)
//	@Modifying
	List<Movie> findMoviesByName(@Param(value = "name")  String movieName);
	//save
	//saveAll
	//deleteById
	//findById
	//findAll

	@Query(value = "SELECT * FROM movies limit ?1, ?2", nativeQuery = true)
	List<Movie> pagabale(Integer begin, Integer length);
}

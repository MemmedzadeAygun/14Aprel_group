package com.example.movie_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie_project.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	//save
	//saveAll
	//deleteById
	//findById
	//findAll
}

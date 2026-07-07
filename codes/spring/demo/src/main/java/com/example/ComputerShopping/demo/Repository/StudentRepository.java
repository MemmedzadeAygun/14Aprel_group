package com.example.ComputerShopping.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ComputerShopping.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
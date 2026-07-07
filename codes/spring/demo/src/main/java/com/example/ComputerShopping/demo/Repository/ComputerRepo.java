package com.example.ComputerShopping.demo.Repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ComputerShopping.demo.RequestDto.ComputerRequestDto;
import com.example.ComputerShopping.demo.ResponseDto.ComputerResponseDto;
import com.example.ComputerShopping.demo.entity.Computer;

public interface ComputerRepo extends JpaRepository<Computer, Long>{
    List<Computer> findByBrandContaining(String brand);
    
    
    @Query(value = "SELECT * FROM computer WHERE price BETWEEN :a AND :b", nativeQuery = true)
    List<Computer> findComputersByPriceRange(@Param("a") Double a, @Param("b") Double b);

	ComputerResponseDto save(ComputerRequestDto dto);

	ComputerResponseDto update(Long id, ComputerRequestDto dto);

	
	@Query(value = "SELECT * from computer limit ?1, ?2", nativeQuery = true)
	List<Computer> pagination(Integer begin, Integer length);
    	
}
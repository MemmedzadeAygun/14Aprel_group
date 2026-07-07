package com.example.ComputerShopping.demo.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComputerResponseDto {
	
    private Long id;
    private String brand;
    private String model;
    private Double price;
    
}
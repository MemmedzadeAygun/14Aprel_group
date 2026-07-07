package com.example.ComputerShopping.demo.RequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Data;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComputerRequestDto {

    private Long id;
    private String brand;
    private String model;
	private Double price;
	
}
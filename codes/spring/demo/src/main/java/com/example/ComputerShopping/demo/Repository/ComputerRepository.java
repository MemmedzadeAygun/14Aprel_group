package com.example.ComputerShopping.demo.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.ComputerShopping.demo.entity.Computer;

@Repository
public class ComputerRepository {

    private List<Computer> computers = new ArrayList<>();

    public ComputerRepository() {
        computers.add(new Computer(1L, "Dell", "Inspiron"));
        computers.add(new Computer(2L, "HP", "Pavilion"));
        computers.add(new Computer(3L, "Lenovo", "ThinkPad"));
    }

    public List<Computer> findAll() {
        return computers;
    }
    
    

    public List<Computer> getAllComputers() {
        return computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void deleteComputer(long id) {
        computers.removeIf(computer -> computer.getId() == id);
    }

	public static void update(Computer computer) {
		// TODO Auto-generated method stub
		
	}

	public static Optional<Computer> getComputerById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public String save(Computer computer) {
		// TODO Auto-generated method stub
		return "Computer saved successfully!";
	}

	public Long findById(Long id) {
		// TODO Auto-generated method stub
		return id;
	}
}
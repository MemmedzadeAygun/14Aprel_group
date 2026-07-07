package com.example.ComputerShopping.demo.Service;

import java.util.List ; 
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ComputerShopping.demo.Repository.ComputerRepo;
import com.example.ComputerShopping.demo.RequestDto.ComputerRequestDto;
import com.example.ComputerShopping.demo.ResponseDto.ComputerResponseDto;
import com.example.ComputerShopping.demo.entity.Computer;

import az.developia.spring_project_14aprel.entity.Book;

@Service
public class ComputerService {
//	@Autowired
//    private static ComputerRepository computerRepository;
//
//    public List<com.example.ComputerShopping.demo.entity.Computer> getAllComputers() {
//        return computerRepository.getAllComputers();
//    }
//
//    public String addComputer(com.example.ComputerShopping.demo.entity.Computer computer) {
//        computerRepository.addComputer(computer);
//		return "Computer update successful!";
//    }
//
//    public void deleteComputer(long id) {
//        computerRepository.deleteComputer(id);
//    }
//    
//    
//    
//    public String updateBook(Computer computer) {
//    	if (computer.getId() == null || computer.getId() <= 0) {
//    	throw new IllegalArgumentException("id mgst not be null or le");
//    	}
//
//    	Optional<Computer> bookById = ComputerRepository.getComputerById(computer.getId());
//    	if (bookById.isPresent()) {
//    	ComputerRepository.update(computer);
//    	}else {
//    	throw new IllegalArgumentException("id not found");
//    	}
//		return null;
//    }
    
	
	@Autowired
	public ModelMapper modelmapper;
	
	
    @Autowired
    private ComputerRepo repository;

    public String addComputer(ComputerRequestDto d) {
		Computer computer = new Computer();
		modelmapper.map(d, computer);
		repository.save(computer);
		return "Computer ugurla qeydiyyat edildi!";
    }
    
    public List<Computer> getAllComputers() {
        return repository.findAll();
    }

    public Optional<Computer> getComputerById(Long id) {
        return repository.findById(id);
    }

    public Computer updateComputer(Long id, Computer computer) {
        computer.setId(id);
        return repository.save(computer);
    }

    public void deleteComputer(Long id) {
        repository.deleteById(id);
    }

	public List<Computer> findByBrandContaining(String brand) {
		return repository.findByBrandContaining(brand);
	}
	
	public List<Computer> findComputersByPriceRange(Double minPrice, Double maxPrice) {
		return repository.findComputersByPriceRange(minPrice, maxPrice);
	}

	public ComputerResponseDto save(ComputerRequestDto dto) {
		return repository.save(dto);
	}

	public ComputerResponseDto getById(Long id) {
		 Optional<Computer> byId = repository.findById(id);
		 
		 ComputerResponseDto responsedto = new ComputerResponseDto();
		 
		 if(byId.isPresent()) {
			 Computer computer = byId.get();
			 modelmapper.map(computer, responsedto);
		 }
		 
		 return responsedto;
	}

	public ComputerResponseDto update(Long id, ComputerRequestDto dto) {
		return repository.update(id, dto);
	}

	
	public List<Computer> pagination(Integer begin, Integer length) {
		return repository.pagination(begin, length);
	}
	
	
}
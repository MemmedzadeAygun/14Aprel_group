package com.example.ComputerShopping.demo.entity;

import org.springframework.web.bind.annotation.*;

import com.example.ComputerShopping.demo.Repository.ComputerRepo;
import com.example.ComputerShopping.demo.RequestDto.ComputerRequestDto;
import com.example.ComputerShopping.demo.ResponseDto.ComputerResponseDto;
import com.example.ComputerShopping.demo.Service.ComputerService;

import az.developia.spring_project_14aprel.entity.Book;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
@RequestMapping("/computers")
public class ComputerController {

//    List<Computer> computerList = new ArrayList<>();
//
//    @GetMapping
//    public List<Computer> getAllComputers1() {
//
//        computerList.add(new Computer(1, "Dell", "Inspiron"));
//        computerList.add(new Computer(2, "HP", "Pavilion"));
//
//        return computerList;
//    }
//
//    @PostMapping
//    public String addComputer1(@RequestBody Computer computer) {
//
//        System.out.println(computer);
//
//        return "Computer added successfully";
//    }
//    
//    
//    
//    @Autowired
//    private DataSource datasource;
//    
//    
//    @PostMapping
//    public String addComputer(@RequestBody Computer computer) {
//
//        String sql = "INSERT INTO computers(brand, model) VALUES ('"+computer.getBrand()+"', '"+computer.getModel()+"')";
//
//        Connection conn;
//		try {
//			conn = datasource.getConnection();
//			Statement st = conn.createStatement();
//			st.executeUpdate(sql);
//		conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//        return "Computer added successfully";
//    }
//
//    @GetMapping
//    public List<Computer> getAllComputers() {
//
//        String sql = "SELECT * FROM computers";
//
//        return datasource.query(sql, (rs, rowNum) ->
//                new Computer(
//                        rs.getLong("id"),
//                        rs.getString("brand"),
//                        rs.getString("model")
//                )
//        );
//    }
//    
//    
//    @GetMapping("/{id}")
//    public Computer getComputerById(@PathVariable Long id) {
//
//        String sql = "SELECT * FROM computers WHERE id = 1";
//
//        return datasource.queryForObject(
//                sql,
//                new Object[]{id},
//                (rs, rowNum) -> new Computer(
//                        rs.getLong("id"),
//                        rs.getString("brand"),
//                        rs.getString("model")
//                )
//        );
//    }
//    
//    
//    @Autowired
//    private ComputerService computerService;
//    
//    
//    
//    @GetMapping
//    public List<Computer> getAllComputers(
//            @RequestParam(required = false) String brand) {
//
//        if (brand != null) {
//            return computerService.findByBrand(brand);
//        }
//
//        return computerService.getAllComputers();
//    }
//    
//    
//
//    @GetMapping
//    public List<Computer> getAllComputers2() {
//        return computerService.getAllComputers();
//    }
//    
//    
//    
//    @GetMapping
//    public List<Computer> getAllComputers11() {
//        return computerService.getAllComputers();
//    }
//
//    @PostMapping
//    public String addComputer11(@RequestBody Computer computer) {
//        computerService.addComputer(computer);
//        return "Computer added successfully";
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteComputer(@PathVariable long id) {
//        computerService.deleteComputer(id);
//        return "Computer deleted successfully";
//    }
//    
//    @PutMapping(path = "/update")
//    public String updateComputer(@RequestBody Computer computer) {
//    	return computerService.addComputer(computer);
//    }
//    
//
//    private List<Computer> computers = new ArrayList<>();
//
//    @PostMapping
//    public String addComputer(@RequestBody Computer computer) {
//        computers.add(computer);
//        return "Computer added successfully";
//    }
//    
    
    @Autowired
    private ComputerService service;

    @PostMapping
    public String addComputer(@RequestBody ComputerRequestDto computer) {
        return service.addComputer(computer);
    }

    @GetMapping
    public List<Computer> getAllComputers() {
        return service.getAllComputers();
    }

    @GetMapping("/{id}")
    public Optional<Computer> getComputerById(@PathVariable Long id) {
        return service.getComputerById(id);
    }

    @PutMapping("/{id}")
    public Computer updateComputer(@PathVariable Long id,
                                   @RequestBody Computer computer) {
        return service.updateComputer(id, computer);
    }

    @DeleteMapping("/{id}")
    public String deleteComputer(@PathVariable Long id) {
        service.deleteComputer(id);
        return "Computer deleted successfully";
    }
    
    

    @GetMapping("/search")
    public List<Computer> findByBrand(@RequestParam String brand) {
        return service.findByBrandContaining(brand);
    }
    
    
    @GetMapping(path = "/getcomputer")
    public List<Computer> findComputersByPriceRange(@RequestParam Double minPrice, Double maxPrice){
    	return service.findComputersByPriceRange(minPrice, maxPrice);
    }
    
    
    @PostMapping
    public ComputerResponseDto save(@RequestBody ComputerRequestDto dto) {
        return service.save(dto);
    }
    
    @GetMapping("/{id}")
    public ComputerResponseDto getById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    @PutMapping("/{id}")
    public ComputerResponseDto update(@PathVariable Long id,
                                      @RequestBody ComputerRequestDto dto) {
        return service.update(id, dto);
    }
    
    

	@GetMapping(path = "/pagination/begin/{begin}/length/{length}") 
	public List<Computer> pagination(@PathVariable Integer begin, @PathVariable Integer length) {
		return service.pagination(begin, length);
	}
	
    
}
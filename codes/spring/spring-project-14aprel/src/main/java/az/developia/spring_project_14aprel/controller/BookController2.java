package az.developia.spring_project_14aprel.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_14aprel.entity.Book;

@RestController
public class BookController2 {

	@Autowired
	private DataSource dataSource;

	@GetMapping(path = "/getBooks")
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();

		try {
			String query = "SELECT * FROM book;";
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setYear(rs.getInt("year"));
				books.add(book);
			}

			conn.close();
			rs.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return books;
	}

	@GetMapping(path = "/getBook/{id}")
	public Book getBook(@PathVariable Integer id) {

		Book book = null;

		try {
			String query = "SELECT * FROM book WHERE id='"+id+"';";
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			rs.next();
			book = new Book();
			book.setId(rs.getInt("id"));
			book.setName(rs.getString("name"));
			book.setYear(rs.getInt("year"));

			conn.close();
			rs.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return book;
	}

	@PostMapping(path = "/addBook")
	public String addBook(@RequestBody Book book) {

		try {
			String query = "insert into book(name, year) values('" + book.getName() + "','" + book.getYear() + "')";
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(book);

		return "Kitab ugurla elave edildi!";
	}
}

package az.developia.spring_project_14aprel.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import az.developia.spring_project_14aprel.entity.Book;

@Repository
public class BookRepository {
	 
	@Autowired
	private DataSource dataSource;

	public List<Book> getBooks(String name, String year) {
		List<Book> books = new ArrayList<Book>();

		try {
			String query;
			if (name == null || name.trim().isEmpty()) {
				query = "SELECT * FROM book;";

			} else {

				query = "SELECT * FROM book WHERE name LIKE '%" + name + "%' and year='"+year+"';";
			}
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

	public Book getBook(Integer id) {
		Book book = null;

		try {
			String query = "SELECT * FROM book WHERE id='" + id + "';";
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
	
	public Optional<Book> getBookById(Integer id) {
		Book book = null;

		try {
			String query = "SELECT * FROM book WHERE id='" + id + "';";
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs.next()) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setYear(rs.getInt("year"));

				conn.close();
				rs.close();
				
				return Optional.of(book);
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return Optional.empty();

	}
	

	public void addBook(Book book) {
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

	}

	public void deleteBook(Integer id) {
		try {
			String query = "delete from book where id = '"+id+"';";
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void update(Book book) {
		try {
			String query = "update book SET name = '"+book.getName()+"', year = '"+book.getYear()+"' WHERE id='"+book.getId()+"';";
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(query);
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}




}

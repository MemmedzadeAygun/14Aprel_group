package az.developia.couserManagementSystem.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import az.developia.couserManagementSystem.entity.Teacher;
import az.developia.couserManagementSystem.exception.MyRuntimeException;

public class TeacherRepository {

	public void add(Teacher teacher) throws MyRuntimeException {

		if (teacher.getName().length() > 45) {
			throw new MyRuntimeException("Ad max 45 simvol ola biler");
		}

		String query = "INSERT INTO teachers(name, surname, age, username, password) VALUES" + "('" + teacher.getName()
				+ "', '" + teacher.getSurname() + "', '" + teacher.getAge() + "', '" + teacher.getUsername() + "', '"
				+ teacher.getPassword() + "')";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_sytem_db?useSSL=false",
					"root", "1234");

			Statement st = conn.createStatement();

			st.executeUpdate(query);

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}

	public boolean checkUser(String username) throws MyRuntimeException {

		boolean userIsExists = false;

		String query = "SELECT COUNT(*) FROM teachers WHERE username = '" + username + "';";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_sytem_db?useSSL=false",
					"root", "1234");

			Statement st = conn.createStatement();

//			st.executeUpdate(query);

			ResultSet rs = st.executeQuery(query);
			rs.next();

			userIsExists = rs.getInt(1) == 1 ? true : false;

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}

		return userIsExists;
	}

	public boolean login(String username, String password) throws MyRuntimeException {

		boolean userIsExists = false;

		String query = "SELECT COUNT(*) FROM teachers WHERE username = '" + username + "' AND password = '" + password
				+ "';";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_sytem_db?useSSL=false",
					"root", "1234");

			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(query);
			rs.next();

			userIsExists = rs.getInt(1) == 1 ? true : false;

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}

		return userIsExists;
	}

}

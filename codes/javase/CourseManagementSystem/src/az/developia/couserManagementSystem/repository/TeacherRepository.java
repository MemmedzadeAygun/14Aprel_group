package az.developia.couserManagementSystem.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import az.developia.couserManagementSystem.entity.Teacher;

public class TeacherRepository {

	public void add(Teacher teacher){

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
}

package az.developia.couserManagementSystem;

import az.developia.couserManagementSystem.entity.Teacher;
import az.developia.couserManagementSystem.exception.MyRuntimeException;
import az.developia.couserManagementSystem.repository.TeacherRepository;

public class MainClass {
	public static void main(String[] args) {

		Teacher teacher = new Teacher(null, "Vuqar", "Rustemli", 13, "vuqar5", "1234");

		TeacherRepository repo = new TeacherRepository();
		try {
			
//			if (repo.login(teacher.getUsername(), teacher.getPassword())) {
			if (repo.login("vuqar", "12345")) {
				System.out.println("user logged in");
			}else {
				System.out.println("username or password is incorrect!");
			}

			if (repo.checkUser(teacher.getUsername())) {
				System.out.println("User is exists");
			}else {
				repo.add(teacher);
				System.out.println("teacher was added");
			}
			

		} catch (MyRuntimeException e) {
			System.out.println(e.getMyMessage());
		}
	}

}

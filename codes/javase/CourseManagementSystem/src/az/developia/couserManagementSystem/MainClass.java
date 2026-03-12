package az.developia.couserManagementSystem;

import az.developia.couserManagementSystem.entity.Teacher;
import az.developia.couserManagementSystem.exception.MyRuntimeException;
import az.developia.couserManagementSystem.repository.TeacherRepository;

public class MainClass {
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher(null, "Vuqarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr", "Rustemli", 13, "vuqar", "1234");
		
		TeacherRepository repo = new TeacherRepository();
		try {
			repo.add(teacher);
		} catch (MyRuntimeException e) {
			System.out.println(e.getMyMessage());
		}
	}
}

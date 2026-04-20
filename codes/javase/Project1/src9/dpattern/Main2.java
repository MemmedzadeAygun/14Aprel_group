package dpattern;

import java.util.ArrayList;

interface User {
	void update(String message);
}

class Student implements User{
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + ": " + message);
	}
	
}

class Teacher {
	 ArrayList<User> users = new ArrayList<User>();
	
	public void addStudent(User user) {
		users.add(user);
	}
	
	public void sendMessage(String message) {
		for(User user : users) {
			user.update(message);
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.addStudent(new Student("Eli"));
		teacher.addStudent(new Student("Veli"));
		teacher.addStudent(new Student("Xedice"));
		teacher.addStudent(new Student("Aslan"));
		
		teacher.sendMessage("Ders basladi!");
	}
}

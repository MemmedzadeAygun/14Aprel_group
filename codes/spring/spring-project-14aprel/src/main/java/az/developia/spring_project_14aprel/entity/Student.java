package az.developia.spring_project_14aprel.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private Integer id;
	private String name;
	private String surname;
	
	public Student() {
		this.id = 1;
		this.name = "Eli";
		this.surname = "Memmedov";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
}

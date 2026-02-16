package oop;

public class Employee extends Person {

	public Employee(int age, String name, String surname) {
		super(age, name, surname);
	}

	@Override
	public int changeAge() {
		return super.age =20;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
	
//	@Override
//	public Employee getPerson() {
//		return new Employee();
//	}
}

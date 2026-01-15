package oop;

public class Person {

	public int age;
	public String name;
	public String surname;
	
	
	public Person(int age, String name, String surname) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public int changeAge() {
		return this.age = 12;
	}

	
//	@Override
//	public String toString() {
//		return "Person{Age=" + age +",name=" + name + ",surname=" + surname+ "}";
//	}
	
	
	
//	public Person getPerson() {
//		return new Person();
//	}
}

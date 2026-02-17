package test;

public class Student implements Comparable<Student>{

	int age;
	String name;
	
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "[age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}

package inheritance;

public class Employee extends Object{
	private String name;
	private String surname;
	private Double salary;
	private Integer age;
	private Developer developer;

//	public Employee() {
//		this.name = "Sema";
//		this.surname = "Allahverdiyeva";
//		this.salary = 3000.50;
//		this.age = 12;
//	}
	
	public Employee(String name, String surname, Double salary, Integer age) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.age = age;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void showInfos() {
		System.out.println("Name: " + this.name);
		System.out.println("Surname: " + this.surname);
		System.out.println("Salary: " + this.salary);
		System.out.println("Age: " + this.age);
	}
	
	public void run(Developer dev) {
		System.out.println(dev.getDepartment());
	}

}

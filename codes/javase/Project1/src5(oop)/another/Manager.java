package another;

import inheritance.Employee;

public class Manager extends Employee {
	private boolean userIsCheckUp;

	public Manager(String name, String surname, Double salary, Integer age) {
		super(name, surname, salary, age);
		this.userIsCheckUp = false;
//		System.out.println(super.name);
	}
	
//	public void showInfos() {
//		System.out.println("Name: " + getName());
//		System.out.println("Surname: " + getSurname());
//		System.out.println("Salary: " + getSalary());
//		System.out.println("Age: " + getAge());
//		
//		System.out.println(userIsCheckUp);
//	}
	
	@Override
	public void showInfos() {
		super.showInfos();
		
		System.out.println(userIsCheckUp);
	}
	
//	public Manager() {
//		super();
//	}
	
	
}

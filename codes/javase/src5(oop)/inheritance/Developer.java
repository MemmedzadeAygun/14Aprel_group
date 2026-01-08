package inheritance;

public class Developer extends Employee {
	private String department;

	public Developer(String name, String surname, Double salary, Integer age, String department) {
		super(name, surname, salary, age);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

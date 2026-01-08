package obj;

public class User {
	public String name;
	public String surname;
	public static int age;
	public String color;
	public String email;
	public String password;
	
//	int a = 12;
	
	static {
		System.out.println("Ilk obyekt ucun ise dusecek");
	}
	
	{
		System.out.println("Diger obyektler ucun de ise dusecek");
	}

	public User() {
		System.out.println("Obyekt yaradildi");
//		this.name = "Celil";
	}

	public User(String _name, String _surname, int _age, String _color, String _email, String _password) {
		this.name = _name;
		this.surname = _surname;
		this.age = _age;
		this.color = _color;
		this.email = _email;
		this.password = _password;
	}
	
	public User(String _name,String _surname) {
		this.name = _name;
		this.surname = _surname;
	}
	
	public void show() {
		System.out.println("Name: " + this.name + ", Surname: " + this.surname + ", Age: " + this.age);
	}
	
	public int changeAge() {
		
	  return this.age = 21;
	}
	
	public void changeAge(int newAge) {
//		 a = 30;
		this.age = newAge;
	}
	
	public static int calculateRetirementAge(int retirementAge) {
		return retirementAge - age;
	}
	
}

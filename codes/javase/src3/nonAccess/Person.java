package nonAccess;

public class Person {

	//public static final int age = 0;
//	public final int age = 23;
	public final int age;
	
//	public int changeAge() {
//		return age++;
//	}
	
	public Person() {
		this.age = 15;
//		age = 15;
	}
	
	
	public void showInfo() {
		System.out.println("User age: " + this.age);
	}
}

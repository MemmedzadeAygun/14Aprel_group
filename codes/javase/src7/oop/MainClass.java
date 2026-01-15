package oop;

public class MainClass {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.age = 15;
//		
//		System.out.println("User age = " + p1.changeAge());
//		
//		Employee e1 = new Employee();
//		System.out.println(e1.changeAge());
		
//		Person p2 = p1.getPerson();
//		p2.age = 16;
//		System.out.println(p2.age);
//		
//		Employee e2 = new Employee();
//		e2.age = 23;
//		System.out.println(e2.age);
		
		Person p3 = new Person(12,"Vuqar", "Rustemli");
		System.out.println(p3.toString());

		Employee e3 = new Employee(15,"Aslan","Qasimov");
		System.out.println(e3);
	}

}

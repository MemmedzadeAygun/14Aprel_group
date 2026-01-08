package obj;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		User user = new User("Vuqar", "Rustemov",12,"vuqar@gamil.com","1234","esmer");
//		user.calculateRetirementAge(65);
		int calculateRetirementAge = User.calculateRetirementAge(65);
		System.out.println(calculateRetirementAge);
		
//		User user = new User();
//		System.out.println(user.changeAge() + 10);
		
//		int result = user.changeAge() + 10;
//		System.out.println(result);
		
		user.show();
		user.changeAge(34);
		user.show();
		
		User user3 = new User();
		
//		user.name = "Vuqar";
	
//		user.surname = "Rustemli";
//		user.age = 12;
//		user.email = "vuqar@gamil.com";
//		user.password = "1234";
//		user.color = "esmer";
		
//		User user2 = new User();
		
		
		User user2 = new User("Aygun", "Memmedzade");		
//		System.out.println(user2.name);
//		System.out.println(user2.surname);
//		
//		System.out.println("-----------------");
//		
//		System.out.println(user.name);
//		System.out.println(user.surname);
//		System.out.println(user.email);
//		System.out.println(user.password);
//		System.out.println(user.age);
//		System.out.println(user.color);
		
		Calculator calc = new Calculator();
		int average = calc.average(12, 5);
		
//		int average2 = calc.average(15, 6);
//		System.out.println(average);
//		System.out.println(average2);
		
	}
	

}

package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Students> students = Arrays.asList(
				new Students("EliImran", 40),
				new Students("Vuqar", 80),
				new Students("Aslan", 50),
				new Students("Omer", 75),
				new Students("Mustafa", 92)
				
				);
		
		 students.stream()
		.filter(s -> s.getScore() > 50)
		.map(a -> a.getName().toUpperCase())
//		.toList();
		.forEach(System.out::println);
		
		Integer max = students.stream()
		.map(s -> s.getScore())
		.reduce(0, (a, b) -> a > b ? a : b);
		
		System.out.println(max);
		
	}
}

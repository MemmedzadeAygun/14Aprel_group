package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(12, "Ehmed"));
		list.add(new Student(9, "Vuqar"));
		list.add(new Student(10, "Esmer"));
		list.add(new Student(10, "Aydin"));
		list.add(new Student(11, "Mine"));
		
//		Collections.sort(list, new StudentComperator());
//		Collections.sort(list, new StudentNameComperator());
		Collections.sort(list, new StudentAgeComperator());
		
		
		System.out.println(list);
	}
}

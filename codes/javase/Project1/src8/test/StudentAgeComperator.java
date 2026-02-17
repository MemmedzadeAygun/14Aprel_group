package test;

import java.util.Comparator;

public class StudentAgeComperator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {		
		if (s1.age < s2.age) {
			return -1;
		}else if(s1.age > s2.age) {
			return 1;
		}
		return 0;
	}

}

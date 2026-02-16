package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class MainClass2 {
	public static void main(String[] args) {
		ArrayList<String> v = new ArrayList<String>();
		v.add("Esma");
		v.add("Adil");
		v.add("Mahmud");
		v.add("Xedice");
		v.add("Nigar");
		v.add(2, "Veli");
		v.set(1, "Omer");
		
		System.out.println(v);
		
		String[] array =  v.toArray(new String[v.size()]);
		
//		System.out.println(Arrays.toString(array));
		
		for (String string : array) {
			System.out.println(string);
		}
		
//		System.out.println(v.capacity());
//		System.out.println(v.size());
	}
}

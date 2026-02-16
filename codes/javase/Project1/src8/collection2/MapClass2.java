package collection2;

import java.util.*;


public class MapClass2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Nicat");
		names.add("Turqay");
		names.add("Yusif");
		names.add("Yusif");
		names.add("Sema");
		names.add("Sema");
		names.add("Sema");
		
		System.out.println(names);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
	
		
		for (String name : names) {
			if (map.containsKey(name)) {
				Integer count = map.get(name);
				count++;
				map.replace(name, count);
			}else {
				map.put(name, 1);
			}
		}
		
		System.out.println(map);
	}
}

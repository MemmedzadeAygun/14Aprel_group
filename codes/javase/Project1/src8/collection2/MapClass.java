package collection2;

import java.util.*;
import java.util.Map.Entry;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;

public class MapClass {
	public static void main(String[] args) {
//		Map<String, String> m = new HashMap<String, String>();
//		HashMap<String, String> fruits = new HashMap<String, String>();
//		LinkedHashMap<String, String> fruits = new LinkedHashMap<String, String>();
		TreeMap<String, String> fruits = new TreeMap<String, String>();
		fruits.put("alma", "apple");
		fruits.put("ciyelek", "strawberry");
		fruits.put("limon", "lemon");
		fruits.put("armud", "pear");
//		fruits.put("limon", "lemon2");
//		fruits.put(null, null);
		
//		System.out.println(fruits.size());
//		fruits.remove("alma");
//		fruits.clear();
		
		System.out.println(fruits);
		
//		for (String key : fruits.values()) {
//			System.out.println(key);
//		}
		
//		System.out.println(fruits.get("armud"));
//		System.out.println(fruits.keySet());
//		System.out.println(fruits.values());
		
//		for(Map.Entry<String, String> fruit : fruits.entrySet()) {
//			System.out.print("az => " + fruit.getKey());
//			System.out.println(" en => " + fruit.getValue());
//		}
		
//		Set<Entry<String, String>> entry = fruits.entrySet();
//		Iterator<Entry<String, String>> iterator = entry.iterator();
//		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next().getValue());
//		}
	}
}

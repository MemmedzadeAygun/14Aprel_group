package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
		
//		ArrayList<String> arrl = new ArrayList<String>();
//		arrl.add("Alma");
//		arrl.add("Gilenar");
//		arrl.add("Armud");
//		arrl.add("Ciyelek");
		
//		Collections.sort(arrl);
//		Collections.sort(arrl, Collections.reverseOrder());
		
//		System.out.println(arrl.get(0));
//		System.out.println(arrl.get(1));
//		System.out.println(arrl.get(2));
		
//		for (String l : arrl) {
//			System.out.println(l);
//		}
		
//		System.out.println(arrl.size());
		
//		arrl.remove("Armud");
//		arrl.remove(0);
//		boolean contains = arrl.contains("Armud");
//		
//		if (contains) {
//			for (int i = 0; i < arrl.size(); i++) {
//				System.out.println(i + "-ci indexdeki element: " + arrl.get(i));
//			}			
//		}else {
//			System.out.println("Bu meyve siyahida movcud deyil");
//		}
		
		
		LinkedList<Integer> linkedl = new LinkedList<Integer>();
		linkedl.add(12);
		linkedl.add(10);
		linkedl.add(13);
		linkedl.addFirst(25);
		linkedl.addLast(34);
		linkedl.add(11);
		
		linkedl.removeLast();
//		linkedl.remove(0);
		
//		System.out.println(linkedl.get(0));
		System.out.println(linkedl.getFirst());
//		System.out.println(linkedl.get(3));
		System.out.println(linkedl.getLast());
	}
}

package demo;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>(); //LIFO
		s.push("Nergiz");
		s.push("Huseyn");
		s.push("Veli");
		s.push("Ehmed");
		
//		System.out.println(s.peek());
//		s.remove(0);
//		System.out.println(s.get(1));
		
		System.out.println(s.pop());
		
		System.out.println(s);
	}
}

package oop;

public class Main {
	public static void main(String[] args) {
		
//		Product product = new Product();
		
		Electronic e1 = new Electronic();
		e1.add();
		e1.delete();
		e1.update();
		String string = e1.get();
		System.out.println(string);
		
		
		Clothing c1 = new Clothing();
		c1.add();
		c1.delete();
		c1.update();
		String string2 = c1.get();
		System.out.println(string2);
		
	}
}

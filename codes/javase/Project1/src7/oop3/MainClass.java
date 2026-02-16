package oop3;

import oop3.OuterClass.InnerClass;

public class MainClass {
	public static void main(String[] args) {

		OuterClass outer = new OuterClass(12, 10);
		outer.doIt();
		
		System.out.println(outer);
//		InnerClass inner = Outer.new InnerClass(12, 34, 23, 20);
		InnerClass inner = new OuterClass.InnerClass(12, 34, 23, 20);
		System.out.println(inner);
	}
}

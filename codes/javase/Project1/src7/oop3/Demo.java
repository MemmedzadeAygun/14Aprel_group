package oop3;

interface Test {
	interface Test2 {
		public void show();
	}
}

public class Demo implements Test {
	private void show() {
		System.out.println("Nested interface...");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.show();
	}
}

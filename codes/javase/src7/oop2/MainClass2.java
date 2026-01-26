package oop2;

public class MainClass2 {

	public static void main(String[] args) {
		Eatable eatable = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("the customer is eating now...");
			}
		};
		eatable.eat();
	}

}

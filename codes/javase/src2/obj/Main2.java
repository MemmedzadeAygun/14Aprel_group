package obj;

public class Main2 {
	
	String name;
	
	public static void main(String[] args) {
		int a = 45;
//		
//		System.out.println("first value: " + a);
//		changeNumber(a);
//		System.out.println("last value: " + a);		
		
		
		Main2 m1 = new Main2();
		m1.name = "Aygun";
//		
		System.out.println("first value: " + m1.name);
//		
		changeName(m1);
//		
		System.out.println("last value: " + m1.name);
	}
	
	 static void changeName(Main2 m1) {
		m1.name = "Səma";
	}

	static void changeNumber(int a) {
		a = a + 10; //20
	}

}

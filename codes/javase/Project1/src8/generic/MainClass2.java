package generic;

public class MainClass2 {
	public static void main(String[] args) {
		OldGeneric old = new OldGeneric();
		old.setT("salam");
//		old.setT("hello");
//		old.setT(123);
//		old.setT(123.34);
		
//		System.out.println(old.getT());
		
		String name = (String) old.getT();
		
		System.out.println(name);
	}
}

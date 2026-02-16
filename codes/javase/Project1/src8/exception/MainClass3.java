package exception;

public class MainClass3 {
	public static void main(String[] args){
		try {
			methodA();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void methodA() {
		methodB();
	}
	
	public static void methodB() {
		int a = 12;
		int result = a / 0;
		System.out.println(result);
	}
}

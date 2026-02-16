package exception;

public class MainClass {
	public static void main(String[] args) {

		// ArrayIndexOutOfBoundsException
//		int[] arr = {12, 4, 6, 7};
//		
//		int a = 0;
//		
//		try {
//			a = arr[6];
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		
//		System.out.println(a);

		// StringIndexOutOfBoundsException
//		String text = "Hello";
//		
//		try {
//			char charAt = text.charAt(7);
//		System.out.println(charAt);
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}

		// ArithmeticException
//		int b = 12;
//		try {
//			int result = b / 0;
//		System.out.println(result);
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}

		// NullPointerException
//		Test t = new Test();
//		Test t = null;
//		t = new Test();

//		try {
//			t.a = 12;
//			System.out.println(t.a);
//		} catch (NullPointerException e) {
//			System.out.println(e.getMessage());
//		}

		// NumberFormatException
//		String s = "123";
//		String s = "123a";
//		try {
//			int num = Integer.parseInt(s);
//		System.out.println(num);
//		} catch (NumberFormatException e) {
//			System.out.println(e.getMessage());
//		}finally {
//			System.out.println("Finally bloku ise dusdu...");
//		}

		// multicatch
//		String[] str = { "12", "34", "56dh", "7" };
//
//		try {
//			String result = str[5];
//
//			System.out.println(result);
//			
//			int r = Integer.parseInt(str[2]);
//			System.out.println(r);
//
//		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
//			System.out.println(e.getMessage());
//		}
//		catch (NumberFormatException e) {
//			System.out.println(e.getMessage());
//		}

//		String[] str = { "12", "34", "56dh", "7" };
//
//		try {
//			String result = str[0];
//			System.out.println(result);
//
//			try {
//				int number = Integer.parseInt(str[2]);
//				System.out.println(number);
//
//			} catch (NumberFormatException e) {
//				System.out.println(e.getMessage());
//			}
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}

	}
}

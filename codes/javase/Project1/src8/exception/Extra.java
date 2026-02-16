package exception;

public class Extra {
	public static void main(String[] args) {
		Integer[] arr = {12, 4, 5, 7};
		
		int a = 0;
		
		try {
			a = arr[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(a + 10);
		}
		
		
		System.out.println(a);
 	}
}

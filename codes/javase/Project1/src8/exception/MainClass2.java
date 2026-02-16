package exception;

public class MainClass2 {
	public static void main(String[] args) throws MenimExceptionSinifim {
		Example e = new Example();
		
		int[] array = {12, 4, 7, 8};
		try {
			e.bringArrayElement(array, 5);
		} catch (MenimExceptionSinifim e2) {
			System.out.println(e2.getMyMessage());
		}
		
	}
}

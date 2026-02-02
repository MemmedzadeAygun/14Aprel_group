package exception;

public class Example {

	public int bringArrayElement(int[] arr, int index) throws MenimExceptionSinifim  {
		
		int result = 0;
		
		if (index >= arr.length) {
			throw new MenimExceptionSinifim("index not found");
		}
		
//		try {
//			result = arr[index];
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
		
		return result;
	}
}

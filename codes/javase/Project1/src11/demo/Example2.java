package demo;

public class Example2 {
	public static void main(String[] args) {
		int[] arr = {12, 3, 5, 7};
		//massivin elementlerinin cemini tapin
		//massivin max elementini tap
		
		int min = arr[0];
		for(int a = 1; a < arr.length; a++) {
			if (arr[a] < min) {
				min = arr[a];
				
			}
			
		}
		
		
	}
}

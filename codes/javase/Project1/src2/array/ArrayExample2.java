package array;

import java.util.Arrays;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		int[] arr = {12, 4, 5, 6};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		doIt(12, 3, 4, 5, 6);
		
//		int[] arr2 = {12, 4, 5, 4};
		
//		int[][] twoArray = new int[3][4];
//		twoArray[0][0] = 10;
		
//		System.out.println(Arrays.equals(arr, arr2));
		
//		double[] array = new double[3];
		
//		Arrays.fill(array, 8);
		
//		System.out.println(Arrays.toString(array));
 		
//		int[] copyOfRange = Arrays.copyOfRange(arr, 1, 4);
		
//		System.out.println(Arrays.toString(copyOfRange));
		
//		int[] copyArray = Arrays.copyOf(arr, 7);
		
//		System.out.println(Arrays.toString(copyArray));
//		System.out.println(Arrays.toString(arr));
		
//		int index = Arrays.binarySearch(arr, 20);
//		
//		System.out.println(index);
		
//		doIt(12, 4, 5, 6, 0);
//		doIt(arr);
	}
	
	static void doIt(int ...a) {
		
		for (int i : a) {
		System.out.println(i);
			
		}
	}
	
//	static void doIt(int a, int b, int c, int d, int f) {
//		System.out.println(a + " " + b);
//	}
}

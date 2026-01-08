package str.copy;

import java.util.Arrays;

public class Main {
	
//	final static String RED = "RED";
//	final static String BLUE = "BLUE";
	
	public static void main(String[] args) {
//		String s1 = "RED";
//		String s2 = "BLUE";
		
		
//		String s1 = RED;
//		String s2 = BLUE;
		
		Color s1 = Color.RED;
		Color s2 = Color.BLUE;
		
//		System.out.println(s1);
//		System.out.println(s2);
		
		Color[] colors = Color.values();
		
		String[] strColors = new String[colors.length];
		
		for (int i = 0; i < colors.length; i++) {
			strColors[i] = colors[i].toString();
			
		}
		
		System.out.println(Arrays.toString(strColors));
		
//		System.out.println(Arrays.toString(values));
		
//		for (Color color : values) {
//			System.out.println(color);
//		}
	}
}

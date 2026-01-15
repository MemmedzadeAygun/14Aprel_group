package oop2;

public class MainClass {

	public static void main(String[] args) {
		Computer c1 = new Computer("Inspire", 2025);
		Computer c2 = new Computer("Inspire", 2025);
//		String s2 = "Alma";
		
//		System.out.println(c1);
//		Computer c2 = new Computer("Nitro", 2017);
		
		
		System.out.println(c1.equals(c2));
	}

}

package oop2;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer c1 = new Computer("Inspire", 2025);
		Computer c2 = new Computer("Inspire", 2025);
		
//		Computer clone = (Computer) c1.clone();
//		clone.year = 2016;
//		
//		System.out.println(c1);
//		System.out.println(clone);
		
		System.out.println(c1.equals(c2));
		
//		c1 = new Computer("Nitro", 2014);
		
//		Computer c2 = c1;
		
//		System.gc(); //garbage collector
//		System.out.println(c1);
//		System.out.println("Proses bitdi..");
		
//		String s2 = "Alma";
		
//		System.out.println(c1);
//		Computer c2 = new Computer("Nitro", 2017);
		
		

//		System.out.println(c1.toString());
		
//		System.out.println(c1.hashCode());
//		System.out.println(c2.hashCode());
	}

}

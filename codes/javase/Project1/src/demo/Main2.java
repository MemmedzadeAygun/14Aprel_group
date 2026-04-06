package demo;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
	
		Counter count = new Counter();
		
		Thread1 t1 = new Thread1(count);
		Thread2 t2 = new Thread2(count);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
//		System.out.println(count.count);
		System.out.println(count.count.get());
	}
	
	
}

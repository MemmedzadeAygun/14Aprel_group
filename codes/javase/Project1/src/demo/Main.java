package demo;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		//single thread -(main thread)
		System.out.println("main ise dusdu");
		
		MyThread myThread = new MyThread();
//		myThread.start();
//		myThread.sleep(1000);
		
		Thread th = new Thread(myThread);
		th.start();
		th.sleep(1000);
		
		System.out.println("main bitdi");
	}
	
	
}

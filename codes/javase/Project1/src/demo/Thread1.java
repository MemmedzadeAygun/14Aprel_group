package demo;

public class Thread1 extends Thread {
	
	Counter c1;
	
	public Thread1(Counter c) {
	this.c1 = c;
	}

	@Override
	public void run() {
		c1.increment();
	}
}

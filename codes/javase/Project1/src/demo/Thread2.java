package demo;

public class Thread2 extends Thread {
	
	Counter c1;
	
	public Thread2(Counter c) {
	this.c1 = c;
	}

	@Override
	public void run() {
		c1.increment();
	}
}

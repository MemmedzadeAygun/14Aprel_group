package demo;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

//	 volatile int count = 0;
	
	AtomicInteger count = new AtomicInteger(0);
	
	public synchronized void increment() {
		for (int i = 0; i < 10; i++) {
//			count++;
			count.getAndIncrement();
		}
	}
}

package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class MainClass {
	public static void main(String[] args) {
//		Queue<String> q = new ArrayBlockingQueue<String>(3); //FIFO
		Queue<String> q = new LinkedList();
		q.add("alma");
		q.add("armud");
		q.add("nar");
//		q.add("heyva");
		
		System.out.println(q.offer("ciyelek"));
		
//		q.remove("armud");
//		q.remove();
//		System.out.println(q.peek());
//		System.out.println(q.poll());
//		q.clear();
		int size = q.size();
		System.out.println(size);
		System.out.println(q.element());
		
		System.out.println(q);
	}
}

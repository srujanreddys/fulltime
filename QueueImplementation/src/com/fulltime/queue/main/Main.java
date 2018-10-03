package com.fulltime.queue.main;

import com.fulltime.queue.Queue;

public class Main {
	/**
	 * main class to test the functionality of the queue
	 * @param args
	 */

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		int dequeue;
		
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(17);
	    queue.enqueue(18);
			
		queue.enqueue(19);
		
		dequeue = queue.dequeue();
		System.out.println(dequeue);
		
		
		dequeue = queue.dequeue();
		System.out.println(dequeue);
		
		dequeue = queue.dequeue();
		System.out.println(dequeue);
		
		dequeue = queue.dequeue();
		System.out.println(dequeue);
		
		dequeue = queue.dequeue();
		System.out.println(dequeue);
	
		dequeue = queue.dequeue();
		System.out.println(dequeue);
		
	}

}

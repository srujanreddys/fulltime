package com.fulltime.queue.main;

import com.fulltime.queue.Queue;

public class Main {
	/**
	 * main class to test the functionality of the queue
	 * @param args
	 */

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		String[] queueArr;
		
		queue.enqueue("14");
		queue.enqueue("15");
		queue.enqueue("16");
		queue.enqueue("17");
		queueArr = queue.enqueue("18");
		for(String element: queueArr) {
			System.out.print(element + " ");
		}
		
		queue.enqueue("19");
		
		queueArr = queue.dequeue();
		System.out.println("");
		for(String element: queueArr) {
			System.out.print(element + " ");
		}
		queueArr = queue.dequeue();
		System.out.println("");
		for(String element: queueArr) {
			System.out.print(element + " ");
		}
		queueArr = queue.dequeue();
		System.out.println("");
		for(String element: queueArr) {
			System.out.print(element + " ");
		}
		queueArr = queue.dequeue();
		System.out.println("");
		for(String element: queueArr) {
			System.out.print(element + " ");
		}
		queueArr = queue.dequeue();
		System.out.println("");
		for(String element: queueArr) {
			System.out.print(element + " ");
		}
		queueArr = queue.dequeue();
		System.out.println("");
		for(String element: queueArr) {
			System.out.print(element + " ");
		}

	}

}

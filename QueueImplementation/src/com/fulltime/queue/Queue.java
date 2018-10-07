package com.fulltime.queue;
/**
 * Implementing queue using an array
 * @author Roopasri
 *
 */
public class Queue {
	
	private int size;
	private int[] queueArr;
	private int head;
	private int tail;
	/**
	 * creates a queue with given size
	 * @param size
	 */
	public Queue(int size) {
		this.size = size;
		init();
	}
	/**
	 * initializes head and tail to 0
	 * Creating an array with size given
	 */
	public void init() {
		this.head = 0;
		this.tail = 0;
		queueArr = new int[size];
	}
	/**
	 * inserting an element to the queue
	 * @param element
	 * @return Array with elements inserted
	 */
	public void enqueue(int element) {
		if(queueArr.length != tail) {
			queueArr[tail] = element;
			tail++;
		}else {
			System.out.println("queue is full");
		}
		
	}
	/**
	 * removing the first element from the queue and moving head pointer
	 * @return an array with first element removed
	 */
	public int dequeue() {
		if(queueArr.length > 0  ) {
			if(head !=tail) {
				  head++;
			}
			else {
				queueArr[head-1] =0;
				System.out.println("queue is empty. there is nothing to dequeue");
			}
		}
		return queueArr[head-1];
	}
}

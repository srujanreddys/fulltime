package com.fulltime.queue;
/**
 * Implementing queue using an array
 * @author Roopasri
 *
 */
public class Queue {
	
	private int size;
	private String[] queueArr;
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
		queueArr = new String[size];
	}
	/**
	 * inserting an element to the queue
	 * @param element
	 * @return Array with elements inserted
	 */
	public String[] enqueue(String element) {
		if(queueArr.length != tail) {
			queueArr[tail] = element;
			tail++;
		}else {
			System.out.println("queue is full");
		}
		return queueArr;
	}
	/**
	 * removing the first element from the queue and moving head and tail pointers
	 * @return an array with first element removed
	 */
	public String[] dequeue() {
		if(queueArr != null && queueArr.length != 0 ) {
			if(head !=tail) {
				if(head == tail-1) {
					queueArr[head] = "";
				}else {
					for(int i=head; i<=queueArr.length-2; i++) {
						queueArr[i]= queueArr[i+1];
						
					}
					queueArr[tail-1]="";
					
				}
				tail--;
			}
		
			
			else {
				System.out.println("queue is empty. there is nothing to dequeue");
			}
		}
		return queueArr;
	}
}

package com.fulltime.stack;


public class Stack {

	private int top;
	
//	private List<Integer> stackList;
	
	private int size;
	int[] stackArr = null;
	/**
	 * Stack constructor
	 * @param size is the size of the stack
	 */
	public Stack( int size) {
		this.size = size;
	    init();	
	}
	private void init() {
		stackArr = new int[size];
		top = 0;
	}
	/**
	 * insert the values in the stack
	 * @param x is the value of the variable to be inserted in stack
	 * @return the Array with elements pushed
	 */
	public void push(int x) {
		if(top < 0 || top > size-1) {
			System.out.println("index exceeded the size");
		}else {
			stackArr[top] = x;
//			stackList.add(top, x);
			top++;
			
			
		}
		 
	}
	/**
	 * removes the last element inserted in list
	 * @return the new array with last element popped
	 */
	public int pop() {

		if(stackArr.length > 0 && top >0) {
			top --;
		}else {
			stackArr[top] = 0;
			System.out.println("Stack is empty");
		}
		return stackArr[top];
	}
	
	
}

package com.fulltime.stack;

import java.util.List;

public class Stack {

	private int top;
	
//	private List<Integer> stackList;
	
	private int size;
	String[] stackArr = null;
	/**
	 * Stack constructor
	 * @param size is the size of the stack
	 */
	public Stack( int size) {
		this.size = size;
	    init();	
	}
	private void init() {
		stackArr = new String[size];
		top = 0;
	}
	/**
	 * insert the values in the stack
	 * @param x is the value of the variable to be inserted in stack
	 * @return the Array with elements pushed
	 */
	public String[] push(String x) {
		if(top < 0 || top > size-1) {
			System.out.println("index exceeded the size");
		}else {
			stackArr[top] = x;
//			stackList.add(top, x);
			top++;
			
			
		}
		return stackArr;
	}
	/**
	 * removes the last element inserted in list
	 * @return the new array with last element popped
	 */
	public String[] pop() {
//		int[] popArr = new int[top-1];
//		for(int i= 0; i< popArr.length ; i++) {
//			popArr[i] = stackArr[i];
//		}
		if(top != stackArr.length) {
			for(int i= top-1; i< stackArr.length -1 ; i++) {
			      stackArr[i] = stackArr[i+1];
			}
		}else {
			stackArr[top-1] = "";
		}
		
		top--;
		return stackArr;
	}
	
	
}

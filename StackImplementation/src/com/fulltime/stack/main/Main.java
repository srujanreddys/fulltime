package com.fulltime.stack.main;


import com.fulltime.stack.Stack;

public class Main {

	public static void main(String[] args) {
		
		int size = 5;

		String[] stackArr = null;
		Stack s = new Stack(size);
		stackArr = s.push("10");
		stackArr = s.push("20");
		stackArr = s.push("30");
		stackArr = s.push("40");
		stackArr = s.push("50");
		
		for (String element: stackArr) {
			
            System.out.print(element + " ");
        }	
		System.out.println("");
		stackArr = s.pop();
        for (String element: stackArr) {
            System.out.print(element+" ");
        }
        
        System.out.println("");
        stackArr = s.pop();
        for (String element: stackArr) {
        	
            System.out.print(element + " ");
        }
        
        System.out.println("");
        stackArr = s.pop();
        for (String element: stackArr) {
        	
            System.out.print(element + " ");
        }
        
		
	}
}

package com.fulltime.stack.main;


import com.fulltime.stack.Stack;

public class Main {

	public static void main(String[] args) {
		
		int size = 5;
		int stack = 0;
		
		Stack s = new Stack(size);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		stack = s.pop();
        System.out.println(stack);
        stack = s.pop();
        System.out.println(stack);
        stack = s.pop();
        System.out.println(stack);
        stack = s.pop();
        System.out.println(stack);
        stack = s.pop();
        System.out.println(stack);
        stack = s.pop();
        System.out.println(stack);
        		
	}
}

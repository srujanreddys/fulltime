package com.fulltime.linkedlist;
/**
 * 
 * @author Roopasri
 * Node object that holds the data and next node address
 */
public class Node {
	
	private int data;
	private Node nextNodeAddress;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNodeAddress() {
		return nextNodeAddress;
	}

	public void setNextNodeAddress(Node nextNodeAddress) {
		this.nextNodeAddress = nextNodeAddress;
	}
	
}

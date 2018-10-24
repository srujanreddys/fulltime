package com.fulltime.linkedlist;

public class ReverseList {
	
	public List reverseList(List list) {
		Node headNode = list.getHeadNode();
		Node pointer = headNode;
		while(pointer.getNextNodeAddress() != null) {
			Node node = pointer.getNextNodeAddress();
			pointer.setNextNodeAddress(node.getNextNodeAddress());
			node.setNextNodeAddress(headNode);
			headNode = node;
		}
		list.setHeadNode(headNode);
		return list;
	}

}

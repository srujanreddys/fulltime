package com.fulltime.linkedlist;

public class TestLinkedList {
	public static void main(String[] args) {
		Node n = new Node();
		List emptyList = new List();
		emptyList.addElementInBetween(20, 1);
		emptyList.printList();
		ReverseList inputList = new ReverseList();
		n.setData(5);
		List list = new List(n);
		list.printList();
		list.addElement(10);
		list.printList();
		list.addEndElement(15);
		list.printList();
		list.addElementInBetween(20, 2);
		list.printList();
		list.addElementInBetween(25, 5);
		list.printList();
		list.addElementInBetween(30, 57);
		list.printList();
		List reverseList = inputList.reverseList(list);
		System.out.print("reverse list: ");
		reverseList.printList();
		list.deleteElement();
		
		list.printList();
		list.deleteEndElement();
		list.printList();
		list.deleteInBetween(15);
		list.printList();
	}
}

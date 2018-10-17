package com.fulltime.linkedlist;
/**
 * 
 * @author Roopasri
 * Linked List Implementation
 */
public class List {
	/** 
	 * Head Node
	 */
	private Node headNode;
	private Node node;
	/**
	 * Adding an element at the starting position of list
	 * @param element
	 */
	public List(Node headNode) {
		this.headNode = headNode;
	}
	/**
	 * constructor to create an emptyList
	 */
	public List() {
		
	}
	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}
	
	public Node getHeadNode() {
		return headNode;
	}
	
	public void addElement(int element) {
		Node n = new Node();
		n.setData(element);
		if(headNode !=null) {
			n.setNextNodeAddress(headNode);
			headNode = n;
		}else {
			setHeadNode(n);
		}
		
	}
	/**
	 * adding element in the last position of list
	 * @param element
	 */
	public void addEndElement(int element) {
		node = headNode;
		Node n = new Node();
		n.setData(element);
		if(node != null) {
			while(node.getNextNodeAddress() != null) {
				node = node.getNextNodeAddress();
				
			}
			node.setNextNodeAddress(n);
		}else {
			setHeadNode(n);
		}
		
		
		
			
		
	}
	
	/**
	 * adding an element in the given position
	 * If the list is empty and the given position is 1, element is inserted in position 1
	 * @param element
	 * @param position
	 */
	
	public void addElementInBetween(int element, int position) {
		node = headNode;
		
		if(node != null) {
			Node n = new Node();
			n.setData(element);
			for(int i=1; i<position-1; i++) {
				if(node.getNextNodeAddress() != null) {
					node = node.getNextNodeAddress();
				}else {
					System.out.println("Position does not exist in the list");
					node = null;
					break;
				}
				
			}
			if(node != null) {
				n.setNextNodeAddress(node.getNextNodeAddress());
				node.setNextNodeAddress(n);	
			}
		}else if(position == 1) {
			Node n = new Node();
			n.setData(element);
			setHeadNode(n);
		}else {
			System.out.println("emptyList");
		}
		
		
	}
	/**
	 * delete  the first element in the list
	 */
	public void deleteElement() {
		headNode = headNode.getNextNodeAddress();
	}
	/**
	 * delete the last element in the list
	 */
	public void deleteEndElement() {
		node = headNode;
		while(node.getNextNodeAddress().getNextNodeAddress() != null) {
			node = node.getNextNodeAddress();
		}
		node.setNextNodeAddress(null);

		
	}
	/**
	 * check if given element is in the list, if it exists remove the element
	 * @param element
	 */
	public void deleteInBetween(int element) {
		node = headNode;
		while(node.getNextNodeAddress()!=null && node.getNextNodeAddress().getData() != element) {
			node = node.getNextNodeAddress();
		}
		if(node.getNextNodeAddress() == null && node.getData() != element) {
			System.out.println("element does not exist in the list");
		}else {
			node.setNextNodeAddress(node.getNextNodeAddress().getNextNodeAddress());
		}
		
	} 
	/**
	 * print the linked list created
	 */
	
	public void printList() {
		node = headNode;
		if(node !=null) {
			while(node.getNextNodeAddress() != null) {
				System.out.print(node.getData() + "-->" + node.getNextNodeAddress() + ",");
				node = node.getNextNodeAddress();
			}
			
			System.out.print(node.getData() + "-->" + node.getNextNodeAddress());
			System.out.println();
		}else {
			System.out.println("List is empty");
		}
	
	}
	/**
	 * List constructor with headnode intialization
	 * @param headNode
	 */
	
}

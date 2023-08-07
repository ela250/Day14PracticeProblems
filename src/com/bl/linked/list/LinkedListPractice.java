package com.bl.linked.list;


public class LinkedListPractice {
	Node head; 
	/*declare node class
	 * initialize data and the pointer
	 */
	class Node {
		int data;
		Node next;
		Node(int value){
			this.data = value;
			this.next= null;
		}
	}
	
	//At first head node will be set as null using constructor
	LinkedListPractice(){
		head = null;
	}
	
	//method to insert object in the beginning
	public void insertAtFirst(int value) {
		Node newNode = new Node(value);
		// when list is empty
		if(head == null) {
			head = newNode;
		}else {//when list is not empty
			newNode.next = head;
			head = newNode;
			
		}
	}
	
	//method to traverse the node
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" " );
			temp = temp.next;//jump
		}

	}
	
	//method to insert a node in_between the nodes
	public void insertAtPos(int position,int value) {
		//boundary checking 
		if (position == 0) {
			insertAtFirst(value);
			 return;
			 
		}
		Node newNode = new Node(value);
		Node temp = head;
		for(int i=1;i<position;i++) {
			temp = temp.next;
		
			//boundary checking
			if(temp == null) {
				System.out.println("invalid position");
				return;
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
}


















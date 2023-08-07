package com.bl.linked.list;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedListPractice list = new LinkedListPractice();
		list.insertAtFirst(56);
		list.insertAtFirst(30);
		list.display();
		System.out.println("");
		list.insertAtPos(1,7);
		list.display();
		
		}
}

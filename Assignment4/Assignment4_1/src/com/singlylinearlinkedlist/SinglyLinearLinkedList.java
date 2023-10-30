package com.singlylinearlinkedlist;

public class SinglyLinearLinkedList {
	public static void main(String[] args) {
		List list = new List();
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(50);
		list.addLast(60);
		list.deleteFirst();
		list.deleteLast();
//		list.addAtPosiotion(25, 3);
//		list.deleteAtPosiotion(3);
		list.display();
	}
}

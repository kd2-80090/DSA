package com.doublycircular;

public class DoublyCircularLinkedList {
	public static void main(String[] args) {
		List l1 = new List();
		l1.addFirst(500);
//		l1.deleteFirst();
		l1.addFirst(400);
		l1.addFirst(300);
		l1.addFirst(200);
		l1.addFirst(100);
		l1.addLast(600);
		l1.addLast(700);
		
		l1.addAtPosition(450,5);
		l1.addAtPosition(550, 7);
//		l1.deleteAtPosition(2);
		l1.deleteAtPosition(5);
		l1.deleteAtPosition(6);
		
//		l1.deleteLast();
		l1.forwardDisplay();
		l1.backwardDisplay();
		
//		l1.deleteFirst();
//		l1.forwardDisplay();
		
	}
}

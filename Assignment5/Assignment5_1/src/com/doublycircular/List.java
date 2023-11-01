package com.doublycircular;

public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}		
	}
	
	private int count;
	private Node head;
	public List() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;
			head.next=newnode;
			head.prev=newnode;
		}
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode ;
			head.prev = newnode;
			head = newnode;
		}
		count++;
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;
			head.next = newnode;
			head.prev = newnode;
			
		}
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
		}
		count++;
	}
	
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head.next ==head){
			head = null;
		}
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
	}
	
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}

	public void addAtPosition(int value,int position) {
		
		if(isEmpty()) {
			addFirst(value);
			return;
			}
		else if(position < 1 || position > count+1)
			return;
		else if(position<=1){
			addFirst(value);
		}
		else {
			Node newnode = new Node(value);
			Node trav = head;
			for(int i=1;i<position;i++) {
				trav = trav.next;
			}
			newnode.prev = trav.prev;
			newnode.next = trav.prev.next;
			trav.prev.next = newnode;
			trav.prev = newnode;
			}
			count++;
	}
	
	
	public void deleteAtPosition(int position) {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			Node trav =head;
			for(int i=1;i<position;i++)
				trav = trav.next;
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
	}
	
	public void forwardDisplay() {
		if(isEmpty())
			return;
		Node trav = head;
		System.out.print("List : ");
		do {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}while(trav!=head);
		System.out.println("");
	}
	
	
	public void backwardDisplay() {
		if(isEmpty())
			return;
		Node trav = head.prev;
		System.out.print("Reverse List :");
		do {
			System.out.print(" "+trav.data);
			trav = trav.prev;
		}while(trav!=head.prev);
		System.out.println("");
	}
	
	
}

package com.org.linkedlist;

public class LinkedList {
	
	Node head;
	
	
	
	  public class Node{ int data; Node next; }
	 
	
	public void insert(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}else {
			Node n = head;
			while(n.next!=null) {
				n=n.next;
			}
			
			n.next=node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;		
	}
	
	public void insertAtIndex(int index, int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(index==0) {
			insertAtStart(data);

		}else {
			
			  Node n = head;
			for(int i=0; i<index-1; i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
		
	}
	
	public void deleteAt(int index) {
		if(index==0) {
			head=head.next;
		}else {
			Node n = head;
			Node n1=null;
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			
			n1 = n.next;
			n.next=n1.next;
			
		}
	}
	
	public void showAll() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		
		System.out.println(node.data);
	}
	
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(5);
		l.insert(6);
		l.insertAtStart(4);
		l.insert(8);
		l.insertAtIndex(2, 9);
		l.deleteAt(1);
		//l.insertAtStart(4;

		l.showAll();
	}

}

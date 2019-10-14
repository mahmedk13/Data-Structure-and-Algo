package com.org.queue;

public class PersonQ {
	
	private Person[] q;
	private int total;
	private int size;
	private int rear;
	private int front;
	
	public PersonQ(int size) {
		total=0;
		this.size=size;
		q = new Person[this.size];
		front=0;
		rear=0;
	}
	
	public boolean isFull() {
		if(size==total) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public boolean enqueue(Person p) {
		if(isFull()) {
		return false;
		}else {
			q[rear]=p;
			total++;
			rear=(rear+1)%size;
			return true;
		}
		
	}
	
	public Person dequeue() {
		Person item= q[front];
		front=(front+1)%size;
		total--;
		return item;
	}
	
	public void showAll() {
		int f = front;
		if(total!=0) {
			for(int i=0; i<total; i++) {
			System.out.println(" "+q[f]);
			f=(f+1)%size;
			}
		}
	}

}

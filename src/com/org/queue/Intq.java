package com.org.queue;

public class Intq {
	
	private int[] q;
	private int total;
	private int size;
	private int rear;
	private int front;
	
	public Intq(int size) {
		total=0;
		this.size=size;
		q = new int[this.size];
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
	
	public boolean enqueue(int item) {
		if(isFull()) {
		return false;
		}else {
			q[rear]=item;
			total++;
			rear=(rear+1)%size;
			return true;
		}
		
	}
	
	public int dequeue() {
		int item= q[front];
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

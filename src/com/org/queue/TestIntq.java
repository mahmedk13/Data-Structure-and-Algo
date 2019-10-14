package com.org.queue;

public class TestIntq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intq q= new Intq(4);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(1);
		q.enqueue(6);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.showAll();
		

	}

}

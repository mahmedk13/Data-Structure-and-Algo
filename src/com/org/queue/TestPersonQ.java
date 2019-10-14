package com.org.queue;

public class TestPersonQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonQ q= new PersonQ(4);
		Person p1 = new Person("Maroof", 1000);
		Person p2 = new Person("Hasnain",2000);
		q.enqueue(p1);
		q.enqueue(p2);
		
		
		//System.out.println(q.dequeue());
		//System.out.println(q.dequeue());
		q.showAll();
		

	}

}

package com.org.stack;

import java.util.Arrays;

public class TestPersonStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Maroor", 100);
		Person p2= new Person("Hasnain", 200);
		
		PersonStack ps = new PersonStack(2);
		
		ps.push(p1);
		ps.push(p2);
		
		System.out.println(ps.pop());
		System.out.println(ps.pop());
		System.out.println(ps.pop());


	}

}

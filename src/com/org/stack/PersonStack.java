package com.org.stack;

public class PersonStack {
	private int top;
	private int size;
	private Person[] stack;
	
	public PersonStack(int size) {
		top=0;
		this.size=size;
		stack= new Person[this.size];
	}
	
	
	public boolean isFull() {
		if(top<=stack.length-1) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public boolean isEmpty() {
		if(top==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean push(Person p) {
		if(!isFull()) {
			stack[top]=p;
			top++;
			return true;
		}else {
			return false;
		}
	}
	
	public Person pop() {
		return stack[--top];
		
	}

}

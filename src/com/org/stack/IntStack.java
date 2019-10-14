package com.org.stack;

public class IntStack {
	private int top;
	private int size;
	private int[] stack;
	
	public IntStack(int size) {
		top=0;
		this.size=size;
		stack= new int[this.size];
	}
	
	
	public boolean isEmpty() {
		if(top<=stack.length-1) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean push(int item) {
		if(isEmpty()) {
			stack[top]=item;
			top++;
			return true;
		}else {
			return false;
		}
	}
	
	public int pop() {
		int x = stack[--top];
		return x;
	}

}

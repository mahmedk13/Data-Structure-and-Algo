package com.org.stack;

import java.util.Arrays;

public class TestIntStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack iStack = new IntStack(6);
		
		iStack.push(5);
		iStack.push(3);
		iStack.push(2);
		iStack.push(1);
		iStack.push(4);
		iStack.push(28);
		iStack.push(29);
		System.out.println(iStack.push(30));

		System.out.println(iStack.pop());
		System.out.println(iStack.pop());
		System.out.println(iStack.pop());


	}

}

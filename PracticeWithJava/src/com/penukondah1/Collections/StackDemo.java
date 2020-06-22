package com.penukondah1.Collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		s.push("F");
		System.out.println(s.pop());// F
		System.out.println(s.peek()); // E
		System.out.println(s); // [A, B, C, D, E]
		System.out.println(s.search("A")); //5
		System.out.println(s.search("z")); //-1

	}

}

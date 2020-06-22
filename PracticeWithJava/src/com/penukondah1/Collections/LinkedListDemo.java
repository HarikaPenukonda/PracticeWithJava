package com.penukondah1.Collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		l.add("Hello");
		l.add(30);
		l.add(null);
		l.add("Hello");
		System.out.println(l); //[Hello, 30, null, Hello]
		l.set(0, "World");
		l.add(0, "Harry");
		System.out.println(l); //[Harry, World, 30, null, Hello]
		l.removeLast();
		l.addFirst("CCC");
		System.out.println(l); //[CCC, Harry, World, 30, null]

		

	}

}

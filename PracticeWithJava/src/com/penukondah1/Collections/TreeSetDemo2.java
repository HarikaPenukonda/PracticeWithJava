package com.penukondah1.Collections;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new MyComparator1());
		t.add("Grapes");
		t.add("Banana");
		t.add("Apple");
		t.add("Mango");
		t.add("Strawberry");
		t.add("Melons");
		System.out.println(t); // [Strawberry, Melons, Mango, Grapes, Banana, Apple] descending order

		

	}

}

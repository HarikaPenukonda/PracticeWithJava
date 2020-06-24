package com.penukondah1.Collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("M");
		t.add("Z"); 
		//System.out.println(t.add(new Integer(10))); // ClassCastException as it does not allow Heterogenous objects
		//System.out.println(t.add(null)); // NullPointerException
		//t.add("A"); // NullPointerException
		System.out.println(t); // [A, B, M, Z, a] insertion order is preserved
		

	}

}

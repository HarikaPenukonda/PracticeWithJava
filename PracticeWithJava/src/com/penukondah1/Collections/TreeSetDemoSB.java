package com.penukondah1.Collections;

import java.util.TreeSet;

public class TreeSetDemoSB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeSet t = new TreeSet(); // [Apple, Banana, Grapes, Guava, Melon, Orange]
		TreeSet t = new TreeSet(new MyComparator1()); //ClassCastException from version 11.0 
		t.add(new StringBuffer("Grapes"));
		t.add(new StringBuffer("Apple"));
		t.add(new StringBuffer("Melon"));
		t.add(new StringBuffer("Banana"));
		t.add(new StringBuffer("Guava"));
		t.add(new StringBuffer("Orange"));
		
		System.out.println(t);

	}

}

package com.penukondah1.Collections;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("C"));
		
		System.out.println(t); // [A, B, C, L, M, Z] insertion order is preserved

	}

}

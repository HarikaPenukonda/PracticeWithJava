package com.penukondah1.Collections;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add(12);
		t.add(43);
		t.add(76);
		t.add(35);
		t.add(68);
		t.add(46);
		System.out.println(t);
		

	}

}

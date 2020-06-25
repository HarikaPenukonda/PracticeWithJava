package com.penukondah1.Collections;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t = new TreeSet(new Mycomparator2());
		{
			t.add("A");
			t.add(new StringBuffer("HDJE"));
			t.add("AA");
			t.add("AB");
			t.add("XX");
			t.add(new StringBuffer("HCHF"));
			t.add("MN");
			
			System.out.println(t); // [A, AA, AB, MN, XX, HCHF, HDJE]

		}
		

	}
	
}

package com.penukondah1.Collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h = new HashSet();
		h.add("Java");
		h.add("Python");
		h.add("Sql");
		h.add(10);
		h.add(null);
		h.add("Html");
		System.out.println(h.add("Java")); //false
		System.out.println(h); // [null, Java, Html, 10, Python, Sql] insertion order is not preserved 
		

	}

}

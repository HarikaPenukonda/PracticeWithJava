package com.penukondah1.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet h = new LinkedHashSet();
		h.add("Java");
		h.add("Python");
		h.add("Sql");
		h.add(10);
		h.add(null);
		h.add("Html");
		System.out.println(h.add("Java")); //false
		System.out.println(h); // Java, Python, Sql, 10, null, Html] insertion order is preserved

	}

}

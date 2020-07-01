package com.penukondah1.Collections;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	TreeSet t = new TreeSet(); // Non-generic we can write any datatype
		TreeSet<Integer> t = new TreeSet<Integer>(); // generic, we use only specified datatype
		
		t.add(100);
		t.add(102);
		t.add(104);
		t.add(106);
		t.add(108);
		t.add(107);
		t.add(105);
		t.add(103);
		t.add(101);
		
		System.out.println(t); // [100, 101, 102, 103, 104, 105, 106, 107, 108]
		
		System.out.println(t.ceiling(105)); // 105
		
		System.out.println(t.higher(105)); // 106
		
		System.out.println(t.floor(105)); // 105
		
		System.out.println(t.lower(105)); //104
		
		System.out.println(t.descendingSet()); // [108, 107, 106, 105, 104, 103, 102, 101, 100]
		
		System.out.println(t.pollFirst()); // 100
		
		System.out.println(t.pollLast()); //108
		
		System.out.println(t); // [101, 102, 103, 104, 105, 106, 107]

	}

}

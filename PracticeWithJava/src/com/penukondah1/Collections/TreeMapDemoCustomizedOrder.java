package com.penukondah1.Collections;

import java.util.TreeMap;

public class TreeMapDemoCustomizedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap m = new TreeMap(new MyComparator1());
		m.put("Betty",100);
		m.put("Aria", 102);
		m.put("Emily",104);
		m.put("Spencer",105);
		m.put("Hannah",103);
		m.put("Alison",101);
		
		System.out.println(m); // {Spencer=105, Hannah=103, Emily=104, Betty=100, Aria=102, Alison=101}
		/*Customized sorting order using Comparator Interface*/

	}

}

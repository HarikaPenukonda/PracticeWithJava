package com.penukondah1.Collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap t = new TreeMap();
		t.put(102, "Moose");
		t.put(101,"Betty");
		t.put(104,"Jellybean");
		t.put(105,"Archie");
		t.put(103,"Reggie");
		//t.put("cheryl", "toni"); ClassCastException
		//t.put(null, "Kevin"); NullPointerException
		
		System.out.println(t); // {101=Betty, 102=Moose, 103=Reggie, 104=Jellybean, 105=Archie}

	}

}

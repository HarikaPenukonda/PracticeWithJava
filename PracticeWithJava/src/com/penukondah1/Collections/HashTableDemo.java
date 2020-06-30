package com.penukondah1.Collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Hashtable h = new Hashtable();
//		h.put(5, "A");
//		h.put(2, "B");
//		h.put(6, "C");
//		h.put(15, "D");
//		h.put(23, "E");
//		h.put(16, "F");
//		
//		System.out.println(h); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
		
		Hashtable h = new Hashtable();
		h.put(new Temp1(5), "A");
		h.put(new Temp1(2), "B");
		h.put(new Temp1(6), "C");
		h.put(new Temp1(15), "D");
		h.put(new Temp1(23), "E");
		h.put(new Temp1(16), "F");
		
		System.out.println(h); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
		
		
	

	}

}

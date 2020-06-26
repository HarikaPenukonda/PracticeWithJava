package com.penukondah1.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList t = new ArrayList();
		t.add(10);
		t.add(12);
		t.add(34);
		t.add(1);
		t.add(43);
		t.add(54);
		
		
		ListIterator ltr = t.listIterator();
		
		while(ltr.hasNext()) {
			Integer i = (Integer)ltr.next();
			System.out.println(i);
		}
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}

	}

}

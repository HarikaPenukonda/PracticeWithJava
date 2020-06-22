package com.penukondah1.Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ltr = v.listIterator();
		System.out.println(e.getClass().getName()); // java.util.Vector$1
		System.out.println(itr.getClass().getName()); //java.util.Vector$Itr
		System.out.println(ltr.getClass().getName()); //java.util.Vector$ListItr

	}

}

package com.penukondah1.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("Chiru");
		l.add("Nag");
		System.out.println(l); // [balakrishna, venki, Chiru, Nag]
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext())
		{
			String s = (String)ltr.next();
			if(s.equals("venki"))
			{
				ltr.remove();
			}
			else if (s.equals("Nag"))
			{
				ltr.add("chaitu");
			}
			else if (s.equals("Chiru"))
			{
				ltr.set("charan");
			}
		}
		
		System.out.println(l); // [balakrishna, charan, Nag, chaitu]
 
	}

}

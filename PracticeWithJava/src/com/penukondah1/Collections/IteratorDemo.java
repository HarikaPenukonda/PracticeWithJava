package com.penukondah1.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l = new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
		
		System.out.println(l); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Integer I = (Integer)itr.next();
			if(I%2==0)
				System.out.println(I); //0 2 4 6 8 10
			else
				itr.remove();
		}
		System.out.println(l); //[0, 2, 4, 6, 8, 10]

	}

}

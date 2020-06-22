package com.penukondah1.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		for(int i=0;i<=10;i++)
			{
				//v.addElement(i%2==0);  [true, false, true, false, true, false, true, false, true, false, true]
				v.addElement(i); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

			}
		System.out.println(v);
		Enumeration e = v.elements();	
		while(e.hasMoreElements()) {
			Integer I = (Integer)e.nextElement();
			if(I%2==0) 
				{
					System.out.println(I); // 0 2 4 6 8 10
				}
		}
		
		System.out.println(v); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	
	}

}

package com.penukondah1.Collections;

import java.util.Vector;

public class VectorListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		//Vector v = new Vector(24);
		//Vector v = new Vector(10, 5);
		
		System.out.println(v.capacity()); //10
		for(int i=1;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity()); //10
		v.addElement("A");
		System.out.println(v.capacity()); //20
		System.out.println(v); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

		/*Vector v = new Vector(24);
		 * output : 24
					24
					24
					[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		Vector v = new Vector(10, 5);
					10
					10
					15
					[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]
		 */
		

	}

}

package com.penukondah1.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m = new HashMap();
		m.put("Betty",100);
		m.put("Aria", 102);
		m.put("Emily",104);
		m.put("Spencer",105);
		m.put("Hannah",103);
		m.put("Alison",101);
		
		System.out.println(m); // {Emily=104, Aria=102, Betty=100, Hannah=103, Alison=101, Spencer=105} 
		//Insertion order is not preserved

		System.out.println(m.put("Emily",150)); //104
		//It returns the old value
		
		Set s = m.keySet();
		System.out.println(s); //[Emily, Aria, Betty, Hannah, Alison, Spencer]
		//displays the keys as a set
		
		Collection c = m.values();
		System.out.println(c); // [150, 102, 100, 103, 101, 105]
		//displays the values as a set
		
		Set s1 = m.entrySet();
		System.out.println(s1); // [Emily=150, Aria=102, Betty=100, Hannah=103, Alison=101, Spencer=105]
		//displays the entry<key,value> as a set
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"..."+m1.getValue());  
			/* Emily...150
			Aria...102
			Betty...100
			Hannah...103
			Alison...101
			Spencer...105*/
			
			//using the cursor Iterator we are printing the key-value pair
			
			if(m1.getKey().equals("Alison"))
			{
				m1.setValue(420);
				//we are replacing the value of Alison by using setValue()
			}
		}
		
		System.out.println(m); //{Emily=150, Aria=102, Betty=100, Hannah=103, Alison=420, Spencer=105}
		
		

	}

}

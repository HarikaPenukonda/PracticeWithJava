package com.penukondah1.Collections;

import java.util.Comparator;

public class MyComparator1 implements Comparator {
	
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String)obj1; //typecasting
		String s2 = obj2.toString();
		
		return s2.compareTo(s1);
		//return -s1.compareTo(s2);
	}

}

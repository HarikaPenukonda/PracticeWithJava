package com.penukondah1.Collections;

import java.util.Comparator;

public class MyComparatorEmployee implements Comparator {
	

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		
		String s1 = e1.name;
		String s2 = e2.name;
		
		return s1.compareTo(s2);
		//return s2.compareTo(s1); //customized sorting i..e descending order or we can also use return -s1.compareTo(s2);
	}

}

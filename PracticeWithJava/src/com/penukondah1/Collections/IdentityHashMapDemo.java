package com.penukondah1.Collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap m = new HashMap();
		IdentityHashMap m = new IdentityHashMap();
		{
			Integer I1 = new Integer(10);
			Integer I2 = new Integer(10);
			m.put(I1,"Harika");
			m.put(I2,"Penukonda");
			System.out.println(m); // {10=Penukonda} I1 and I2 are duplicate keys because I1.equals(I2) returns true
			
	/* {10=Harika, 10=Penukonda} I1 and I2 are not duplicate keys because I1==I2 returns false */

		}

	}

}

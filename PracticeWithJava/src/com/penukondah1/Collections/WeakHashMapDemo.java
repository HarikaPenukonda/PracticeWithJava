package com.penukondah1.Collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//HashMap m = new HashMap(); 
		/*In the case of HashMap ,even though object does not have any reference i.e, t=null it is not
		 * eligible for GC if it is associated with Hashap*/
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "Harika"); 
		System.out.println(m); // HashMap {temp=Harika}
		//WeakHashMap {temp=Harika}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m); // HashMap {temp=Harika}
		//WeakHashMap Finalize method is called {}
		/*In case of WeakHashMap if the object does not have any reference if is eligible for GC even 
		 * even though object is associated with WeakHashMap*/

	}

}

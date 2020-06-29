package com.penukondah1.Collections;

public class Employee implements Comparable {
	
	String name;
	int eid;
	
	Employee(String name, int eid)
	{
		this.name = name;
		this.eid = eid;
	}
	
	public String toString()
	{
		return name + " " + eid;
	}

	@Override
	public int compareTo(Object obj) {  //default natural sorting of employee id's
		// TODO Auto-generated method stub
		int eid1 = this.eid;
		Employee e = (Employee)obj;
		int eid2 = e.eid;
		if(eid1>eid2)
		{
			return -1;
		}
		else if (eid1<eid2)
		{
			return 1;
		}
		else
//		if(eid1>eid2) //customized sorting i..e descending order of employee id's
//		{
//			return -1;
//		}
//		else if (eid1<eid2)
//		{
//			return 1;
//		}
//		else
		return 0;
	}

}

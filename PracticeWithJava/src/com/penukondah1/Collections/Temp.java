package com.penukondah1.Collections;

public class Temp {

	public String toString()
	{
		return "temp";
	}
	
	public void finalize()
	{
		System.out.println("Finalize method is called");
	}

}

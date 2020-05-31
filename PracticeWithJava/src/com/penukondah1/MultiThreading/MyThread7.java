package com.penukondah1.MultiThreading;

public class MyThread7 extends Thread {
	
	Display2 d;
	String name;
	
	MyThread7(Display2 d,String name )
	{
		this.d = d;
		this.name = name;
	}
	
	public void run()
	{
		d.wish(name);
	}

}

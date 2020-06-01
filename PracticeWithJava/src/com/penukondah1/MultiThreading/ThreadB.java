package com.penukondah1.MultiThreading;

public class ThreadB extends Thread {
	
	Display3 d;
	String name;
	
	ThreadB (Display3 d, String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run() 
	{
		d.wish(name);
	}

}

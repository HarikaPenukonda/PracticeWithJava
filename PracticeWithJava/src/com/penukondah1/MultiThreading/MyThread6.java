package com.penukondah1.MultiThreading;

public class MyThread6 extends Thread{
	
	Display d;
	String name;
	
	MyThread6 (Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}

}

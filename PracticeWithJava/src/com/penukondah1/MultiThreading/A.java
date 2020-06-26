package com.penukondah1.MultiThreading;

public class A {
	
	public synchronized void d1 (B b)
	{
		
	//	B b = new b
		System.out.println("Thread 1 starting to execute d1(B b)method"); 
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread 1 trying to call Class B last method");
		b.last();
	}
	
	public synchronized void last()
	{
		System.out.println("Inside A, this is last() method");
	}

}

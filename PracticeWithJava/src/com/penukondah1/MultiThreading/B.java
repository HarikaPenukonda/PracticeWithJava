package com.penukondah1.MultiThreading;

public class B {
	
	public synchronized void d2 (A a)
	{
			System.out.println("Thread 2 starting to execute d2(A a)method"); 
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println("Thread 2 trying to call Class A last method");
			a.last();
	}

	public synchronized void last() {
		// TODO Auto-generated method stub
		System.out.println("Inside B, this is last() method");
		
	}

}

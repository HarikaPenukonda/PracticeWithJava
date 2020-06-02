package com.penukondah1.MultiThreading;

public class ThreadB1 extends Thread {
	
	int total = 0;
	public void run()
	{
		synchronized(this) //To get the lock of current object b - this 
		{
			System.out.println("Child thread starts its calculation");
			for(int i=1;i<=100;i++)
			{
				total = total + i;
			}
		
		
			System.out.println("Child thread gives notification after it completes it execution");
			this.notify(); // sends notification to main method that child thread has completed its execution
		}
	}

}

package com.penukondah1.MultiThreading;

public class ThreadA2 {
	
	public static void main(String[] args) throws InterruptedException // when we use wait method we should throw IE (checkedException)
	{
		ThreadB1 b = new ThreadB1();
		b.start();
		synchronized(b) //The thread should have lock of object(b) as the thread should be owner of the object otherwise will get RE:IllegalMonitorStateException
		{
			System.out.println("Main thread trying to call wait method");
			b.wait(); //Main thread goes into waiting state and gives chance for child method to execute
			System.out.println("Main thread recieved notification from notify method");
			System.out.println(b.total);
		
		}		
	}
 
}

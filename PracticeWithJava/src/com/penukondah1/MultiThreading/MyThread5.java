package com.penukondah1.MultiThreading;

public class MyThread5 extends Thread {
	
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("I am a lazy thread"+i);
		}
		System.out.println("I want to sleep");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("I got interrupted");
		}
	}

}

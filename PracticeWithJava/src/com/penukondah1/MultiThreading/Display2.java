package com.penukondah1.MultiThreading;

public class Display2 {
	
	public static synchronized void wish (String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Good Morning :");
			
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println(name);
		}
	}

}

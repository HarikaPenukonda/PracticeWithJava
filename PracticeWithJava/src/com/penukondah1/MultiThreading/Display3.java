package com.penukondah1.MultiThreading;

public class Display3 {
	
	public void wish (String name)
	{
		;;;;;;; //one lakh lines of code
		synchronized(this)
		{
			for(int i=0;i<10;i++)
			{
				System.out.print("Good Morning :");
				try 
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{
					
				}
				System.out.println(name);
			}
		}
		
		;;;;;; // one lakh lines of code
	}

}

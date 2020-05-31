package com.penukondah1.MultiThreading;

public class Display1 {
	
	public void displayN() 
	{
			for(int i=0;i<10;i++) 
			{
				System.out.println(i);
				try {
					Thread.sleep(2000);
			}
				catch(InterruptedException e) 
				{
			
				}
		
		}
	}
	
	public void displayC() 
	{
		for(int i=65;i<75;i++) 
		{
			System.out.println((char)i);
		
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) 
			{
			
			}
		
		}
	}

}

package com.penukondah1.MultiThreading;

public class ThreadYieldDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 t = new MyThread1();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
/*output : Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
*/
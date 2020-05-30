package com.penukondah1.MultiThreading;

public class MyThread3 extends Thread{
	
	static Thread mt; //main thread
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}

}

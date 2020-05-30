package com.penukondah1.MultiThreading;

public class MyThread2 extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread - 1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

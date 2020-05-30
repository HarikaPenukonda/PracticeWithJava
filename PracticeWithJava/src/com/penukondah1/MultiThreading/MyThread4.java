package com.penukondah1.MultiThreading;

public class MyThread4 extends Thread {
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am a lazy thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}

}

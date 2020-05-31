package com.penukondah1.MultiThreading;

public class ThreadA1 extends Thread {
	
Display1 d;
	
	ThreadA1(Display1 d){
		this.d = d;
	}
	
	public void run() {
		d.displayC();
	}

}

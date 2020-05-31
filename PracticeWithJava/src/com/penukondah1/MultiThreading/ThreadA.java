package com.penukondah1.MultiThreading;

public class ThreadA extends Thread {
	
	Display1 d;
	
	ThreadA(Display1 d){
		this.d = d;
	}
	
	public void run() {
		d.displayN();
	}

}

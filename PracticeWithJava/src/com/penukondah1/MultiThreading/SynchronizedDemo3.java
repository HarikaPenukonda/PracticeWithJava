package com.penukondah1.MultiThreading;

public class SynchronizedDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display3 d = new Display3();
		ThreadB t1 = new ThreadB(d,"Dhoni");
		ThreadB t2 = new ThreadB(d,"Yuvraj");
		t1.start();
		t2.start();
		

	}

}

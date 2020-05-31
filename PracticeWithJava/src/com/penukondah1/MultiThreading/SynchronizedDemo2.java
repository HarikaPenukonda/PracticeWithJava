package com.penukondah1.MultiThreading;

public class SynchronizedDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display1 d = new Display1();
		ThreadA t1 = new ThreadA(d);
		ThreadA1 t2 = new ThreadA1(d);
		t1.start();
		t2.start();
		

	}

}

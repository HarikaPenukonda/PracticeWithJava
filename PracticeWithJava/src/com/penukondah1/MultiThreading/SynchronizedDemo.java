package com.penukondah1.MultiThreading;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d = new Display();
		MyThread6 t1 = new MyThread6(d,"Dhoni");
		MyThread6 t2 = new MyThread6(d,"Kohli");
		t1.start();
		t2.start();

	}

}

package com.penukondah1.MultiThreading;

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread4 t = new MyThread4 ();
		t.start();
		t.interrupt();
		System.out.println("End of main");

	}

}

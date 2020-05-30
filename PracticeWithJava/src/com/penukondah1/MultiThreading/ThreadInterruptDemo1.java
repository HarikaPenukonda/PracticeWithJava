package com.penukondah1.MultiThreading;

public class ThreadInterruptDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread5 t = new MyThread5();
		t.start();
		t.interrupt();
		System.out.println("End of main");

	}

}

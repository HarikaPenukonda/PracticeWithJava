package com.penukondah1.MultiThreading;

public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread2 t = new MyThread2 ();
		t.start();
		//t.join();
		t.join(10000);
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread - 1");
		}

	}

}

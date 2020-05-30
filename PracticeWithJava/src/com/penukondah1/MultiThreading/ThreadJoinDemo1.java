package com.penukondah1.MultiThreading;

public class ThreadJoinDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread3.mt = Thread.currentThread();
		MyThread3 t = new MyThread3(); //child thread
		t.start(); 
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}

	}

}

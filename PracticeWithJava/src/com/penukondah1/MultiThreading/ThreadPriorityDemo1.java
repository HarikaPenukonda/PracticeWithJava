package com.penukondah1.MultiThreading;

public class ThreadPriorityDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15); //IllegalArgumentException
		Thread.currentThread().setPriority(7);
		MyThread t = new MyThread();
		System.out.println(Thread.currentThread().getPriority());
	

	}

}

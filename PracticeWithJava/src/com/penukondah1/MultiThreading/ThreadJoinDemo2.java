package com.penukondah1.MultiThreading;

public class ThreadJoinDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.currentThread().join();

	}

}
 //No output, deadlock situation as main thread is calling join method on main object itself
package com.penukondah1.MultiThreading;

public class DaemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().isDaemon()); // Main thread is already started by JVM so it will always be false
		//Thread.currentThread().setDaemon(true); // If we try to change then will get RE : java.lang.IllegalThreadStateException

		MyThread t = new MyThread();
		System.out.println("child thread before setting the daemon status ---> "+t.isDaemon());
		t.setDaemon(true);
		System.out.println("child thread after setting the daemon status ----> "+t.isDaemon());
	}

}

package com.penukondah1.MultiThreading;

public class DeadlockDemo extends Thread {
	
	A a = new A();
	B b = new B();
	
	public void m1()
	{
		this.start();
		a.d1(b); //this line is executed by main thread
	}
	
	public void run()
	{
		b.d2(a); //this line is executed by child thread
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeadlockDemo d = new DeadlockDemo();
		d.m1();
		

	}

}
/* output : Thread 1 starting to execute d1(B b)method
			Thread 2 starting to execute d2(A a)method
			Thread 1 trying to call Class B last method
			Thread 2 trying to call Class A last method
			Inside B, this is last() method
			Inside A, this is last() method
*/ //without synchronized method
//with synchronized methods will get deadlock situation as Thread 1 will be waiting for lock a which is used by Class B
//and Thread 2 will be waiting for lock b which is used by Class B.
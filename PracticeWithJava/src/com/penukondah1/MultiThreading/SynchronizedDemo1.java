package com.penukondah1.MultiThreading;

public class SynchronizedDemo1 {
	
	public static void main(String [] args) {
		
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		MyThread7 t1 = new MyThread7(d1,"Dhoni");
		MyThread7 t2 = new MyThread7(d2,"Kohli");
		t1.start();
		t2.start();
		
	}
	
	
	
	

}

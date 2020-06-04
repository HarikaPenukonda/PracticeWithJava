package com.penukondah1.MultiThreading;

public class DaemonThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadC t = new ThreadC();
		t.setDaemon(true); //Daemon Thread
		t.start();
		System.out.println("End of main thread");

	}

}
/* output : End of main thread
		  	Child Thread
*/
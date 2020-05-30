package com.penukondah1.MultiThreading;

public class SlideRotator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			System.out.println("slide-"+i);
			Thread.sleep(2000);
		}

	}

}

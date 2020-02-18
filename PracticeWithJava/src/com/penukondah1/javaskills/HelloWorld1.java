package com.penukondah1.javaskills;

public class HelloWorld1 {
	
	public void test() {
		System.out.print("Non static");
	}
	
	public static void test1() {
		System.out.print("Static Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		HelloWorld1 obj = new HelloWorld1();
		obj.test();
		test1();

	}

}

package com.penukondah1.javaskills;


//public keyword is an access modifier which represents visibility, it means it is visible to all.

//class keyword is used to declare a class in java.

//static is a keyword, if we declare any method as static, it is known as static method.
//The core advantage of static method is that there is no need to create object to invoke the static method. 

//void is the return type of the method, it means it doesn't return any value.

//String[]args is used for command line argument

//main represents startup of the program

//System.out.println() is used to print statement.


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

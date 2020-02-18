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
	
	
	Integer instanceVariable = 10; // This is instance variable, it has instance/object level
	
	static Integer staticVariable = 30; // Static variable, which is at class level.
	
	public void test() {
		System.out.print("Non static");
		int lv = 10; // this is a local variable, cannot be used outside the method
	}

	
	public static void test1() {
		System.out.print(" Static Method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		HelloWorld1 obj1 = new HelloWorld1();
		obj1.instanceVariable = 40;  //instance variable
		HelloWorld1 obj2 = new HelloWorld1();
		obj2.instanceVariable = 60;
		
		HelloWorld1.staticVariable = 40; //static variable
		
		
		test1();
		obj1.test();

	}

}

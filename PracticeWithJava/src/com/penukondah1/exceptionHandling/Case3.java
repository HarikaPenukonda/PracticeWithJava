package com.penukondah1.exceptionHandling;

public class Case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doStuff();
		System.out.println(10/0);

	}
	private static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
		System.out.println("Hi");
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}


}

/*output : Hello
Hi
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.penukondah1.exceptionHandling.Case3.main(Case3.java:8)
 */

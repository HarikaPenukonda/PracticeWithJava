package com.penukondah1.exceptionHandling;

public class Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doStuff();
	}
	
	private static void doStuff() {
		// TODO Auto-generated method stub
		doMoreStuff();
		System.out.println(10/0);
	}

	private static void doMoreStuff() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}

/* output : Hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.penukondah1.exceptionHandling.Case2.doStuff(Case2.java:13)
	at com.penukondah1.exceptionHandling.Case2.main(Case2.java:7)
 */
 
package com.penukondah1.exceptionHandling;

public class Case6 {
	
	//static ArithmeticException e = new ArithmeticException();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		throw new ArithmeticException ("/ by zero explicitly");

	}

}

/* output : Exception in thread "main" java.lang.ArithmeticException: / by zero explicitly
	at com.penukondah1.exceptionHandling.Case6.main(Case6.java:10)
 */

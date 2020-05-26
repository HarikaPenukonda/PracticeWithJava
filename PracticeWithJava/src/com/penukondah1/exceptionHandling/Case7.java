package com.penukondah1.exceptionHandling;

public class Case7 {
	
	static ArithmeticException e = new ArithmeticException();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		throw e;

	}

}

/*output : Exception in thread "main" java.lang.ArithmeticException
	at com.penukondah1.exceptionHandling.Case7.<clinit>(Case7.java:5)
*/
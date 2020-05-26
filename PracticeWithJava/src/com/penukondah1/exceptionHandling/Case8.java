package com.penukondah1.exceptionHandling;

public class Case8 {
	
	//if e refers null then it will show NullPointerException
	static ArithmeticException e;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		throw e;

	}

}
/*output : Exception in thread "main" java.lang.NullPointerException
	at com.penukondah1.exceptionHandling.Case8.main(Case8.java:10)
*/
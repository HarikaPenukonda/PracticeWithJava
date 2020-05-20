package com.penukondah1.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Case4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
		System.out.println(10/0);
		/*without throws keyword : Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unhandled exception type FileNotFoundException

	at com.penukondah1.exceptionHandling.Case4.main(Case4.java:10)
	
	with throws keyword : Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.penukondah1.exceptionHandling.Case4.main(Case4.java:13)
	*/

	}

}

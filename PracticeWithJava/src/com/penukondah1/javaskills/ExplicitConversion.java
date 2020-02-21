package com.penukondah1.javaskills;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 45d;
		
		int i = (int)d;
		
		System.out.println("d = " + d +  "  d after conversion to int  = " + i);
		
		//Casting may lose information
		
		//For Example : floating point vales are truncated when they are cast to integers
		//i.e. the value of 45.5 when converted to int gives the value of 45
		

	}

}

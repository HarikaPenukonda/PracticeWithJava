package com.penukondah1.javaskills;

public class ImplicitConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char c = 'a'; //ASCII value of a
		
		int k = c; //97
		
		float f = c; //97.0
		
		long l = c; //97
		
		double d = c; //97.0
		
		System.out.println(c + " " + k + " " + f + " " 
				+ l + " " + d);

	}

}

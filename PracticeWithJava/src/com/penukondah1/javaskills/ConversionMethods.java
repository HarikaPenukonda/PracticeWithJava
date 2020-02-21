package com.penukondah1.javaskills;

public class ConversionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String to int : Integer.parseInt()
		String s = "348";
		
		int num = Integer.parseInt(s);
		
		System.out.println("1. String s = " + s + " String s after conversion = " + num);
		
		//String to Integer : Integer.valueOf()
		
		String s2 = "2333";
		
		Integer num2 = Integer.valueOf(s2);
		
		System.out.println("2. String s = " + s2 + " String s after conversion = " + num2);
		
		//int to String : Integer.to String() or String.valueOf()
		
		int a = 23;
		
		String s3 = Integer.toString(a);
		
		String s4 = String.valueOf(a);
		
		System.out.println("3. int a = " + a + " String s after conversion = " + s3);
		
		System.out.println("4. int a  = " + a + " String s after conversion = " + s4);
		

	}

}

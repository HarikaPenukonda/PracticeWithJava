package com.penukondah1.javaskills;

public class NeedOfTypeConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100; //Initiated a variable with type integer
		
		String b = "hello"; //Initiated a variable with type String
		
		String s = a + b;
		
		//The datatypes of both the variables are different 
		
		//But to perform any operation we need both the variables to be of the same datatype
		
		//Here, integer value is converted into String and gets concatenated with other string
		
		System.out.println(s);

	}

}

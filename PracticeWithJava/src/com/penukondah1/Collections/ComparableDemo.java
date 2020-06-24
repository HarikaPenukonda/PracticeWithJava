package com.penukondah1.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("A".compareTo("Z")); // -25
		System.out.println("Z".compareTo("K")); // 15
		System.out.println("Z".compareTo("Z")); // 0
		//System.out.println("A".compareTo(null));  //NullPointerException
		System.out.println("a".compareTo("A")); // 32
	}

}

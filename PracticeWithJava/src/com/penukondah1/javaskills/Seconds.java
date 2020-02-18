package com.penukondah1.javaskills;

public class Seconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sec, min, hours, cal;
		
		sec = 60;
		
		min = 60;
		
		hours = 24;
		
		cal = sec * min * hours; // 5 ** 6 is illegal expression
		
		System.out.print("The number of seconds in a day is :" + cal);

	}

}

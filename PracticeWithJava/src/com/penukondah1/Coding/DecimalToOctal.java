package com.penukondah1.Coding;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int num = sc.nextInt();
		
		String octalNumber = Integer.toOctalString(num); //predefined method  - Integer.toOctalString(int num)
		System.out.println("Conversion of Decimal to Octal = " +octalNumber);
	}

}

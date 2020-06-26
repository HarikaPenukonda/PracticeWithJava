package com.penukondah1.Coding;

import java.util.Scanner;

public class HighestCommonFactor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second value : ");
		num2 = sc.nextInt();
		
		sc.close();
		
		while(num1 != num2)
		{
			if(num1 > num2)
			{
				num1 = num1 - num2;
			}
			else
			{
				num2 = num2 - num1;
			}
		}
		
		System.out.println("GCD of two number is " + num2);
		//System.out.printf("GCD of two number is %d", num2);

	}

}

package com.penukondah1.Coding;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count, num1=0, num2=1,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count ");
		count = sc.nextInt();
		int i=0;
		
		while(i<=count)
		{
			System.out.println(num1+" ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			i++;
		}

	}

}

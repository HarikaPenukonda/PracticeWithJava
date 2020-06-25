package com.penukondah1.Coding;

import java.util.Scanner;

public class SumOfTwoNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the number2 ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		System.out.println("Sum of the numbers : "+sum);

	}

}

// num1 = 123456789122344 InputMismatchException
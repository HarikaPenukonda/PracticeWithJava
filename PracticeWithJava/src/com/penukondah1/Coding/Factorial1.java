package com.penukondah1.Coding;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("The factorial of " +num+ " is " +fact);

	}

}

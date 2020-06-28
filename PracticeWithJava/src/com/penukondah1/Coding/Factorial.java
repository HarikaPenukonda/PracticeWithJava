package com.penukondah1.Coding;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=1;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		int i=1;
		
		while(i<=num)
		{
			fact = fact*i;
			i++;
		}
		
		System.out.println("The factorial of " +num+ " is " +fact);

	}

}

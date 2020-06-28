package com.penukondah1.Coding;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
			temp = num%i;	
		}
		if(temp==0)
		{
			System.out.println("The entered number is not prime number");
		}
		else
			System.out.println("The entered number is prime number");

	}

}

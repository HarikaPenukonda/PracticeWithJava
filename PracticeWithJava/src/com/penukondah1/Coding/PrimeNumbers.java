package com.penukondah1.Coding;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++; 
			}
		}
		if(count==2)
		{
			System.out.println("The entered number is prime number");
		}
		else
			System.out.println("The entered number is not prime number");

	}

}

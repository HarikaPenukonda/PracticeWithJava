package com.penukondah1.javaskills;

import java.util.Scanner;

public class Challenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Enter the number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	if (n%2 != 0)
	{
		System.out.println("weird");
	}
	if (n%2 == 0)
	{
		if (n>=2 && n<=5) 
		{
			System.out.println("not weird");
		}
	}
	if(n%2 == 0)
	{
		if(n>=6 && n<=20)
		{
			System.out.println("Weird");
		}
	}
	if (n%2 == 0)
	{
		if (n > 20)
		{
			System.out.println("Not Weird");
		}
	}

	}

}

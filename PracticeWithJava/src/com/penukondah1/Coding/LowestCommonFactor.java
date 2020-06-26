package com.penukondah1.Coding;

import java.util.Scanner;

/* LCM (Least Common Multiple): The LCM of two numbers is the smallest positive
   integer which is divisible by both numbers.*/
public class LowestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, temp1, temp2, temp, hcf, lcm;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second value : ");
		num2 = sc.nextInt();
		
		temp1 = num1;
		temp2 = num2;
		
		while(temp2!=0)
		{
			temp = temp2;
			temp2 = temp2%temp1;
			temp1 = temp;
		}
		
		hcf = temp1;
		lcm = (num1*num2)/hcf;
		
		System.out.println("The Lowest Common Factor of " + num1 + " and " +num2+ " is " +lcm);
		
		

	}

}

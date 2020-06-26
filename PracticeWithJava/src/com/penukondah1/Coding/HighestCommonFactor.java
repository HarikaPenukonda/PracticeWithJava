package com.penukondah1.Coding;

import java.util.Scanner;

/* HCF (Highest common Factor): HCF is also known as Greatest common divisor, 
 * HCF of two numbers is the largest positive integer that divides both the numbers.*/
public class HighestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp1, temp2, num1, num2, temp, hcf;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value 1 : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter value 2 : ");
		num2 = sc.nextInt();
		
		temp1 = num1;
		temp2 = num2;
		
		while(temp2!=0)
		{
			temp = temp2;
			temp2 = temp1%temp2;
			temp1 = temp;
		}
		
		hcf = temp1;
		
		System.out.println("The Highest Common of Factor of " + num1 + " and " + num2 + " is " +hcf);

	}

}

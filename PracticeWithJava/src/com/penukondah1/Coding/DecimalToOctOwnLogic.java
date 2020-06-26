package com.penukondah1.Coding;

import java.util.Scanner;

public class DecimalToOctOwnLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value : ");
		int num = sc.nextInt();
		
		int rem =0;
		String str = "";
		char dig[]= {'0','1','2','3','4','5','6','7'};
		
		while(num>0)
		{
			rem = num%8;
			str = dig[rem]+str;
			num = num/8;
			
		}
		
		System.out.println("The conversion of decimal" +num+ "to octal is " +str);
		
		
	}

}

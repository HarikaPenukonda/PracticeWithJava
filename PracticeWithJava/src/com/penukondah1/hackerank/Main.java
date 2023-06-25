package com.penukondah1.hackerank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
//		String inputData = " ";
//		String thisLine = null;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		while((thisLine = br.readLine()) != null) {
//			inputData += thisLine + "\n";
//		}
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//System.out.println(numberOfTwos(n));
		System.out.println(numberOfTwosInRange(n));
		
		scanner.close();
		
	}

//	public static String codeHere(String inputData) {
//		// TODO Auto-generated method stub
//		
//		
//		return inputData;
//	}
	
  /*Here we have declared two functions*/	
	
	public static int numberOfTwos(int n) // This function is used to calculate the number os 2 digits in a single number
	{
		int count = 0;
		while(n>0)
		{
			if(n%10==2)
				count++;
			n = n/10;
		}
		return count;
	}
	
	public static int numberOfTwosInRange(int n) { // This function is used to count the number of 2 digits between 0 an n
		
		int count = 0;
		for(int i=2;i<=n;i++)
			count += numberOfTwos(i);
		
		return count;
		
	}

}

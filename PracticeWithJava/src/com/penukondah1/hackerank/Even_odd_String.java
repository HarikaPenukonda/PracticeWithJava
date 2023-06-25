package com.penukondah1.hackerank;

import java.util.Scanner;

public class Even_odd_String {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

	        Scanner sc = new Scanner(System.in);
	        int T = sc.nextInt();
	        sc.nextLine();
	        String str[] = new String[T];
	        for(int i=0;i<T;i++){
	            str[i] = sc.next();
	        }

	        for(int temp=0; temp<T; temp++){
	            for(int j=0; j<str[temp].length(); j=j+2)
	            {
	                System.out.print(str[temp].charAt(j));
	            }
	            System.out.print(" ");
	            for(int j=1; j<str[temp].length(); j=j+2)
	            {
	                System.out.print(str[temp].charAt(j));
	            }
	            System.out.println();
	        }
	        sc.close();



	        
	    }
	}



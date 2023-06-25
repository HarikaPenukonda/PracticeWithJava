package com.penukondah1.hackerank;

import java.util.Scanner;

public class ConditionalStmts_weird {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
            if(i%2 != 0 || (i>5 && i<21)){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        
    }

}

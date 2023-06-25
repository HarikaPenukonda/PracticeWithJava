package com.penukondah1.hackerank;

public class Array {

	public static void main(String[] args) {
		
		int arr [][] =  {{1,2,3},
						 {4,5,6}, 
						 {7,8,9}};
		
		for(int i=0;i<arr.length;i++) { // prints the rows
			for(int j=0;j<arr[i].length;j++) { // prints the columns
				System.out.print(arr[i][j] + " "); 
				//System.out.println(arr[0].length);
				//System.out.println(arr.length);
			}
			
			System.out.println();
		}
		
		
	}

}

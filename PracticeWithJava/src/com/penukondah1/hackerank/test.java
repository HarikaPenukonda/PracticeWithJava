package com.penukondah1.hackerank;

public class test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("A");
			badMethod();
			System.out.println("B");
		}catch(Exception e) {
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		
		

	}

	private static void badMethod() {
		throw new Error();
		
	}

}

package com.penukondah1.Coding;

public class Code2 {
	
	int g(int a) 
	{
		if(a<9) {
			System.out.println(a); //value return from the call g(5) is 5
			return 9;
		}
	
	
	if(a<7) {
		System.out.println(a);
		return 7;
	}
	
	if(a<4) {
		System.out.println(a);
		return 4;
	}
	
	System.out.println(a);
	return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Code2 c = new Code2();
		c.g(5);
		
	}

}

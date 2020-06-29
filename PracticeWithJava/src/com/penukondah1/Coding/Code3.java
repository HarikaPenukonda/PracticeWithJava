package com.penukondah1.Coding;

public class Code3 {
	
	int f(int x)
	{
		return x*2 - 1;
	}
	
	int h()
	{
		int a =3;
		int b = f(a) + f(4);
		System.out.println(b);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Code3 c = new Code3();
		c.h();

	}

}

package com.penukondah1.javaskills;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicit type casting
		/*int x = 'a';
		System.out.println(x); //97*/
		
		/*double d = 10;
		System.out.println(d); //10.0*/
		
		//explicit type casting
		
		int y = 150;
		/*byte b = y; CE: type mismatch cannot convert int to byte */
		byte b = (byte)y;
		System.out.println(b); //-106
		Short s = (short)y;
		System.out.println(s); //150
		
		double d = 130.456;
		int a = (int)d;
		System.out.println(a);
		byte c = (byte)d;
		System.out.println(c);
		
		
		

	}

}

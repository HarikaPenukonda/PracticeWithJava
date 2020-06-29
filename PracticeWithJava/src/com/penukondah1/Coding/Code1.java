package com.penukondah1.Coding;

public class Code1 {
	
	int func2(int w) {
		System.out.println(w*3);
		return w *3; //15
	}
	
	int func1(int a, int b)
	{
		int n = a + b;
		System.out.println(2 + func2(n));
		return 2 + func2(n); // 17
	}
	
	int start() {
		int z = 4;
		System.out.println(func1(z,1) - 3);
		return func1(z,1) - 3; //14
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Code1 c = new Code1();
		c.start();
		
	}

}

package com.penukondah1.hackerank;

public class Exceptions {

	public static void main(String[] args) throws Exception {
		
		System.out.println(mainMethod());
		
	}

	private static String mainMethod() throws Exception {
		// TODO Auto-generated method stub
		try {
			methodA();
		}
		catch(Exception e) {
			methodB();
		}
		finally {
			return "mainMethod()";
		}
		return null;
	}

	private static void methodB()throws Exception {
		// TODO Auto-generated method stub
		
		throw new SQlException();
		
	}

	private static void methodA() throws Exception {
		// TODO Auto-generated method stub
		throw new IOException();
		
	}

}

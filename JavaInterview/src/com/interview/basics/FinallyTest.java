package com.interview.basics;

public class FinallyTest {
	public static int divide(int a, int b){
		int z = -1;
		try{
			z=a/b;
			System.out.println("Try:"+z);
			return a;
		}catch(ArithmeticException ex){
			ex.printStackTrace();
			System.out.println("A:"+a);
			//System.exit(0);
			//Runtime.getRuntime().exit(0);
			return z;
		}
		finally{
			System.out.println("Finally Executed");
			System.out.println("Finally:"+a);
		}
	}
	public static void main(String[] args) {
		System.out.println("Result:"+divide(100,0));
	}
}

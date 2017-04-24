package com.interview.exceptions;

public class ArithmeticsException {
	public static void main(String[] args) {
		int a = 10-100;
		try{
			a=a/0;
			System.out.println("Value of A:"+a);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Value of A/2:"+a/2);
		}finally {
			System.out.println("Finally: "+(a*2));
		}
		System.out.println("End");
	}
}

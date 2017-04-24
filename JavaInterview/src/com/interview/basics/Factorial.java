package com.interview.basics;

public class Factorial {
	public void factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact *= i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		new Factorial().factorial(5);
	}
}

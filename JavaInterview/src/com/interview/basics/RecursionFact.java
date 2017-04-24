package com.interview.basics;

public class RecursionFact {
	static int recurrsionFactorial(int n){
		if(n==1)
			return 1;
		else
			return (n*recurrsionFactorial(n-1));
	}
	
	static int loopingFactorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println("Output: ");
		System.out.println(recurrsionFactorial(5));
		System.out.println(loopingFactorial(5));
	}
}

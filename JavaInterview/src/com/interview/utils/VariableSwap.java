package com.interview.utils;

public class VariableSwap {
	public static void main(String[] args) {
		int a=10,b=12,c=15,d=19,e=34,f=89;
		
		System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a and b After swapping, a: " + a +" b: " + b);
		
		System.out.println("value of c and d before swapping, c: " + c +" d: " + d);
		c=c*d;
		d=c/d;
		c=c/d;
		System.out.println("value of c and d After swapping, c: " + c +" d: " + d);
		
		System.out.println("value of e and f before swapping, e: " + e +" f: " + f);
		e=e^f;
		f=f^e;
		e=e^f;
		/*e ^= f; 
		e ^= (f ^= e);*/
		System.out.println("value of e and f after swapping, e: " + e +" f: " + f);
	}
}

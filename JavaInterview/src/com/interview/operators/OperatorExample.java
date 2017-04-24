package com.interview.operators;

public class OperatorExample {
	public static void main(String[] args) {
		int a=10, b=5,c=20;
		System.out.println(a<b && a++<c);
		System.out.println(a);
		System.out.println(a<b & a++<c);
		System.out.println(a);
	}
}

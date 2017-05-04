package com.interview.basics;

public class ThisInvoker {
	int a, b;
	public ThisInvoker() {
		
	}
	
	public ThisInvoker(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int methodA(int a, int b){
		System.out.println("a*b: "+(a*b));
		return a*b;
	}
	public int methodB(int c, int d){
		return this.methodA(c, d)*d;
	}
	public static void main(String[] args) {
		ThisInvoker invoker = new ThisInvoker();
		System.out.println("c*d: "+invoker.methodB(10, 2));
	}
}

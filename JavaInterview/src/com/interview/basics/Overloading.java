package com.interview.basics;

public class Overloading {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Overloading overloading=new Overloading();
		//overloading.foo(5);
	}
	
	public static int add(int a,int b){
		return (a+b);
	}
	
	public static short add(short a,int b){
		return (short) (a+b);
	}
	
	public  int foo(int g){
		System.out.println("non static method");
		return g;
	}
	
	public static void foo(){
		System.out.println("static method");
	}
	
	
}

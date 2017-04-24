package com.interview.basics;

class A {
	public void M(int i){
		System.out.println("int");
	}
 
	public void M(String s){
		//this is an overloading method
		System.out.println("string");
	}
	
	public void show(){
		System.out.println("hi");
	}
}
 
public class ClassB extends A{
	public void M(int i){
		//this is overriding method
		System.out.println("overriden int");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.M(1);
		a.M("abc");
	 
		A b = new ClassB();
		b.M(1234);
		b.show();
		
		ClassB cb = new ClassB();
		cb.M(12345);
	}
}

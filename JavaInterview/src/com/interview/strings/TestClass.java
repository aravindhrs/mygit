package com.interview.strings;

public class TestClass implements TestInterface{

	@Override
	public void square(int a) {
		 System.out.println(a*a);
	}
	
	public void show(){
		System.out.println("Default method overridden");
	}
	
	public void show1(){
		 System.out.println("Static Method overridden");
	}
	
	public static void main(String[] args) {
		TestClass testClass=new TestClass();
		testClass.square(10);
		
		testClass.show();
		testClass.show1();
	}

}

package com.interview.strings;

class StaticParent{
	public StaticParent(){
		System.out.println("Parent class");
	}
	
	public StaticParent(int a){
		System.out.println("Parent class:"+a);
	}
}

public class StaticTest extends StaticParent{	
	static int i=10;
	
	static{
		System.out.println("Static Block:"+i);
	}
	
	public StaticTest(){
		super(10);
		System.out.println("Hi");
	}
	
	/*public StaticTest(int a){
		super(a);
		System.out.println("Sub class:"+a);
	}*/
	
	public void show(){
		System.out.println("Non Static method");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		new StaticTest().show();
	}
}

package com.interview.basics;

public class ChildSuperTest extends SuperParent{
	public ChildSuperTest(){
		super();
	}
	
	public ChildSuperTest(String s){
		super(s);
	}
	
	public ChildSuperTest(String string, int i) {
		super(string,i);
	}

	public static void main(String[] args) {
		new ChildSuperTest();
		System.out.println("============================");
		new ChildSuperTest("Hello");
		System.out.println("============================");
		new ChildSuperTest("Hello",100);
	}
}

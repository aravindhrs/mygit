package com.interview.basics;

public class StaticVariable {
	static int count=0;
	public void inc(){
		count++;
	}
	public static void main(String[] args) {
		StaticVariable staticVariable=new StaticVariable();
		StaticVariable staticVariable2=new StaticVariable();
		staticVariable.inc();
		System.out.println(count);//1
		staticVariable2.inc();
		System.out.println(count);//2
		staticVariable2.inc();
		System.out.println(count);//3
	}
}

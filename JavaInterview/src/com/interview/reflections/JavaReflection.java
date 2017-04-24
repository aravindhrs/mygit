package com.interview.reflections;

public class JavaReflection {
	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println(foo.getClass().getName());
	}
}

class Foo{
	public void print(){
		int k=0;
		System.out.println("Value of K: "+k++);
	}
}
package com.interview.basics;

public class InstanceInitializer {
	int var;
	
	public InstanceInitializer(){
		System.out.println("Constructor.......");
	}
	
	public static void method(){
		System.out.println("Static method........");
	}
	
	{
		var=10;
		System.out.println("Initializer block:"+var);
	}
	
	static{
		System.out.println("Static block......");
	}
	public static void main(String[] args) {
		System.out.println("Inside Main.....");
		InstanceInitializer initializer = new InstanceInitializer();
		System.out.println(initializer.var);
		InstanceInitializer.method();
		
	}
}

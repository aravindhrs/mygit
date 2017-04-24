package com.interview.basics;

public class SuperParent {
	String superValue="";
	
	public SuperParent(){
		System.out.println("No Param Super construct chaining");
	}
	
	public SuperParent(String s){
		this.superValue=s;
		System.out.println(s+" With Param Super construct chaining");
	}
	
	public SuperParent(String s, int n){
		this(n);
		this.superValue=s;
		System.out.println(s+" With Param Super construct chaining");
	}
	
	public SuperParent(int n){
		System.out.println(n+" :Int Param Super construct chaining");
	}
	
}

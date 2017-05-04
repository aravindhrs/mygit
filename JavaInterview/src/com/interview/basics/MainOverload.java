package com.interview.basics;

public class MainOverload {
	
	public static void main(String[] args){
		System.out.println("Default: public static void main(String[] args)");
	}  
	public static void main(String args){
		System.out.println("public static void main(String args)");
	}  
	public static void main(){
		System.out.println("public static void main()");
	}  
}

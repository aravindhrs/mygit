package com.interview.exceptions;

public class NullPinterException {

	public static void main(String[] args) {
		Excp4();
	}
	
	public static void Excp1(){
		//String s=null;  
		//System.out.println(s.length());
	}
	
	public static void Excp2(){
		String s="abc";  
		System.out.println(Integer.parseInt(s));
	}
	
	public static void Excp3(){
		int s[]=new int[10];  
		System.out.println(s[10]);
	}
	
	public static void Excp4() throws ArrayIndexOutOfBoundsException{
		try{
			int s[]=new int[10];  
			System.out.println(s[10]);
		}catch(ArrayIndexOutOfBoundsException e){
			throw new java.lang.ArrayIndexOutOfBoundsException();
			//System.out.println("Exception Handled");
		}
		System.out.println("Exit of try/catch");
	}

}

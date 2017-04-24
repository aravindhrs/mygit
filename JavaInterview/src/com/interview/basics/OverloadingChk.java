package com.interview.basics;

class ParentClass{
	public double add(String a, String b){
		return Double.parseDouble(a)+Double.parseDouble(b);
	}
}

public class OverloadingChk extends ParentClass{
	public double add(String a){
		return Double.parseDouble(a)+Double.parseDouble(a);
	}
	
	public static void main(String[] args) {
		System.out.println(new OverloadingChk().add("50"));
	}
}

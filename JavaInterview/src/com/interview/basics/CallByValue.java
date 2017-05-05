package com.interview.basics;

public class CallByValue {
	int data=10;
	
	public void incData(int d){
		data=d+10;
	}
	public static void main(String[] args) {
		CallByValue callByValue = new CallByValue();
		System.out.println("before change "+callByValue.data);  
		callByValue.incData(10);
		System.out.println("after change "+callByValue.data);  
	}
}

package com.interview.basics;

public class operation {
	int data=80;
	
	void change(int data){
		this.data=data+700;
		System.out.println("inside change: "+this.data);
	}
	
	public static void main(String[] args) {
		operation opn = new operation();
		System.out.println("before change: "+opn.data);
		opn.change(10);
		System.out.println("after change: "+opn.data);
	}
}

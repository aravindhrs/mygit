package com.interview.enumex;

public class EnumExample {
	public static void main(String[] args) {
		Men m = Men.Aravindh;
		System.out.println("Age of Aravindh is "+m.getAge()+" years");
	}
}

enum Men{
	John(25),Mark(32),Kristen(21),Aravindh(27);
	private int age;
	Men(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
}
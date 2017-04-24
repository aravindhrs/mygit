package com.interview.collectionspkg;

public class Student {
	 int rollno;
	 int age;
	 String name;
	public Student(int rollno,int age,String name) {
		super();
		this.age=age;
		this.rollno=rollno;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}
	
}

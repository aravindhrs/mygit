package com.interview.strings;

public class ToString {
	private int rollno;
	private String name;
	private String dept;
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString(){
		return rollno+" "+name+" "+dept;		
	}

	public static void main(String[] args) {
		ToString toString=new ToString();
		toString.setRollno(1);
		toString.setName("Raj");
		toString.setDept("CS");
		
		ToString toString1=new ToString();
		toString1.setRollno(2);
		toString1.setName("Ram");
		toString1.setDept("IT");
		
		System.out.println(toString);
		System.out.println(toString1);
	}
}

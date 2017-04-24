package com.interview.collectionspkg;

public class ComaparableStudent implements Comparable<ComaparableStudent> {
	int rollno;
	int age;
	String name;
	public ComaparableStudent(int rollno,int age,String name) {
		this.age=age;
		this.rollno=rollno;
		this.name=name;
	}
	
	public int compareTo(ComaparableStudent st){  
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
			return 1;  
		else  
			return -1;  
	}  
}

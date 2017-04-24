package com.interview.basics;

public class ObjectClone implements Cloneable{
	private int rollno;
	private final String name;
	
	public ObjectClone(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();		
	}
	
	public static void main(String[] args) {		
		try {
			ObjectClone ob1 = new ObjectClone(10, "A");
			ObjectClone ob2 = (ObjectClone) ob1.clone();	
			
			if(ob1==ob2)
				System.out.println("equals");
			
			if(ob1.getClass()==ob2.getClass())
				System.out.println("equals using getclass");
			
			if(ob1.equals(ob2))
				System.out.println("using equals");
				
			System.out.println(ob1.rollno+" "+ob1.name);  
			System.out.println(ob2.rollno+" "+ob2.name);  
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

package com.interview.strings;

abstract class AbstClass extends StringPerformance{
	public void abstarctClassTest(){
		System.out.println("abstract Child Class");
	}
	@Deprecated
	abstract void check();
	abstract void check1();
}

abstract class SecondAbst extends AbstClass{
	public abstract void check2();
	void check(){
		
	}
	protected void check1(){
		
	}
}

class NonAbst extends SecondAbst{
	@Override
	public void check() {
		System.out.println("Check1");
	}

	@Override
	public void check2() {
		System.out.println("Check2");
	}	
}

public class AbsClass extends NonAbst{
	@Override
	public void check() {
		System.out.println("Hello");
	}
	
	public void abstarctClassTest(){
		System.out.println("Non-abstract Child Class");
	}
	
	public static void main(String[] args) {
		AbstClass abstClass = new AbsClass(); 
		abstClass.check();
		abstClass.abstarctClassTest();
	}	
}

package com.interview.basics;

public class BlankFinalVariable {
	final static int entryVar;
	final String meanVar;
	final boolean exitVar;
	
	static{
		entryVar = 10;
		System.out.println("Static:"+entryVar);
	}
	
	{
		meanVar="Instance initializer block";
		System.out.println(meanVar);
	}
	
	public BlankFinalVariable(){
		exitVar=true;
		System.out.println("Constructor: "+exitVar);
	}
	
	public static void main(String[] args) {
		new BlankFinalVariable();
	}
		
}

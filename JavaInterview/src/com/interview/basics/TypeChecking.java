package com.interview.basics;

class AClass{
	
	/**
	 * <blockquote><pre>
	 * Returns a instance of class AClass
	 * </pre> </blockquote>
	 * @return this
	 * <p>its a java program</p>
	 */
	AClass me(){
		return this;
	}
	
	public void doA(){
		System.out.println("AClass");
	}
}
public class TypeChecking extends AClass{
	public void doTypeChecking(){
		System.out.println("Subclass");
	}
	
	public static void main(String[] args) {
		AClass aClass = new TypeChecking();//upcasting
		aClass.me().doA();
		TypeChecking checking  = (TypeChecking) new AClass();//downcasting
		checking.doTypeChecking();
	}
}

/*The me() method is declared to return an A, so during compile time, compiler only sees it return an A object. 
However, it actually returns a B object during run-time, since B inherits A's methods and return this(itself)*/

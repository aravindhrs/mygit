package com.interview.basics;

public class CovariantReturnType extends CovariantReturnTypeParent{
	CovariantReturnType get(){
		return this;
	}
	
	public void message(){
		System.out.println("Method Overriding: Different method signature");
	}
	
	public static void main(String[] args) {
		new CovariantReturnType().get().message();
	}
}

class CovariantReturnTypeParent{
	CovariantReturnTypeParent get(){
		return this;
	}
}
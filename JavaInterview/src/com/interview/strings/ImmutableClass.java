package com.interview.strings;

final class ImmutableFinalClass {
	private final String panCardNumber;
	
	public ImmutableFinalClass(String pancardNumber){
		this.panCardNumber=pancardNumber;
	}

	public String getPanCardNumber() {
		return panCardNumber;
	}	
}

public class ImmutableClass{
	public static void main(String[] args) {
		ImmutableFinalClass class1=new ImmutableFinalClass("BKYPA8922J");
		System.out.println(class1.getPanCardNumber());
	}
}

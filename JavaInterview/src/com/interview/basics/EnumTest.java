package com.interview.basics;

public enum EnumTest implements EnumInterface {

	PRINT{
		@Override
		public void print() {
			System.out.println("Hi");
		}
	}
}

package com.interview.basics;

public class Dog implements Animal{

	@Override
	public boolean healthy() {
		return true;
	}
	
	@Override
	public String getname() {
		return "Dog";
	}

	@Override
	public LivingBeings livingBeings() {
		return new Live();
	}
		
	private class Live implements LivingBeings{
		@Override
		public boolean isAlive() {
			return true;
		}
	}
}

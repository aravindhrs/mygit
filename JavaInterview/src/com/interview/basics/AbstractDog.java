package com.interview.basics;

public abstract class AbstractDog extends AnotherAbstractAnimal implements Animal{
	public abstract void move() throws IndexOutOfBoundsException;
	protected abstract void bark();
	public abstract void checkHealth();
}

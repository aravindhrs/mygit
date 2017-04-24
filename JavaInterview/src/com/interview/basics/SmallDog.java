package com.interview.basics;

public class SmallDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		LivingBeings livingBeings = dog.livingBeings();
		System.out.println(dog.livingBeings().toString());
		System.out.println(livingBeings.isAlive());
	}
}

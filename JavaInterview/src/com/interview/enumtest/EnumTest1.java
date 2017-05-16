package com.interview.enumtest;

public class EnumTest1 {
	public static void main(String[] args) {
		System.out.println("All car prices:");
		for (Car car : Car.values()) {
			System.out.println(car + " costs " + car.getPrice() + " thousand dollars.");
		}
	}
}

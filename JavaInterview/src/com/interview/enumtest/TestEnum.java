package com.interview.enumtest;

public class TestEnum {
	public static void main(String[] args) {
		Operation sum = new Operation(10, 5, EOperator.SUM);
		Operation subtraction = new Operation(10, 5, EOperator.SUB);
		Operation div = new Operation(10, 5, EOperator.DIV);

		System.out.println("Sum: " + sum.calculate());
		System.out.println("Subtraction: " + subtraction.calculate());
		System.out.println("div: " + div.calculate());
	}
}
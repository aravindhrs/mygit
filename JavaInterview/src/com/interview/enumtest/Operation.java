package com.interview.enumtest;

public class Operation {
	private int firstOperand;
	private int secondOperand;
	private EOperator operator;

	public Operation(int firstOperand, int secondOperand, EOperator operator) {
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
		this.operator = operator;
	}

	public int calculate() {
		return operator.calculate(firstOperand, secondOperand);
	}

}

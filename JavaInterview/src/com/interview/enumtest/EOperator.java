package com.interview.enumtest;

public enum EOperator implements Operator {
	
	SUM{
		@Override
		public int calculate(int firstOperand, int secondOperand) {
			return firstOperand + secondOperand;
		}
	},
	
	SUB{
		@Override
		public int calculate(int firstOperand, int secondOperand) {
			return firstOperand - secondOperand;
		}
	},
	
	DIV{
		@Override
		public int calculate(int firstOperand, int secondOperand) {
			return firstOperand/secondOperand;
		}
	}
}

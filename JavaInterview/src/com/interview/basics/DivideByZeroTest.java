package com.interview.basics;

public class DivideByZeroTest {
	public static void main(String[] args) {
		double valueD=1;
		System.out.println("Double:"+(valueD/0));
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		if(Double.MIN_VALUE>0.0d)
			System.out.println("MIN_VALUE is Greater");

		System.out.println(Double.longBitsToDouble(0x1L));
		int valueI=1;
		System.out.println("Int:"+(valueI/0));
	}
}

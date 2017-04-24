package com.interview.collectionspkg;

import java.math.BigDecimal;

public class DoubleChk {
	public static void main(String[] args) {
		double d1 = 2.01;
		double d2 = 1.01;
		while((d1-d2)!=1.00){
			System.out.println("infinite loop");
		}
		
		BigDecimal bd1 = new BigDecimal("2.01");
		BigDecimal bd2 = new BigDecimal("1.01");
		while((bd1.intValue()-bd2.intValue())!=1.00){
			System.out.println("infinite loop");
		}
	}
}

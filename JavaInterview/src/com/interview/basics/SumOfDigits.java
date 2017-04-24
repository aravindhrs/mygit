package com.interview.basics;

import java.math.BigDecimal;
import java.util.Scanner;

public class SumOfDigits {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter a number:");
		number=scanner.nextInt();
		float k=0.1f;
		int f=(int) k;
		System.out.println("F:"+f);
		int sum=0;
		while(number!=0){
			sum=sum+(number%10);
			System.out.println(number%10);
			number=number/10;
		}
		System.out.println("Sum of Digits:"+(1/10));
		
		BigDecimal amount3 = new BigDecimal("2.15");
	    BigDecimal amount4 = new BigDecimal("1.10") ;
	    System.out.println(amount3.subtract(amount4));


	
	}
}

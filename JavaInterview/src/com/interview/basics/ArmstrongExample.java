package com.interview.basics;

public class ArmstrongExample {
	public static void main(String[] args) {
		int number=371,temp,sum=0, remainder;
		temp=number;
		while(temp>0){
			remainder = temp%10;
			temp=temp/10;
			sum = sum+(remainder*remainder*remainder);
		}
		if(number==sum)
			System.out.print(number+": is Armstrong number");
		else
			System.out.println(number+": is not a Armstrong number");
	}
}

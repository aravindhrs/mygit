package com.interview.basics;

public class Palindrome {
	public static void main(String[] args) {
		int remainder,sum=0,number=455,temp;
		temp=number;
		while(temp>0){
			remainder=temp%10;
			temp=temp/10;
			sum=(sum*10)+remainder;
		}
		if(number==sum)
			System.out.println(number+": is a Palindrome number");
		else
			System.out.println(number+": is not a Palindrome number");
	}
}

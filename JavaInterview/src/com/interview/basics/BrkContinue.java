package com.interview.basics;

public class BrkContinue {
	static{
		//int j=10/0;
		//throw new ArithmeticException("gh");
	}
	public static void main(String[] args) {
		for(int i=0;i<3;i++){	
			System.out.println(i);
			if(i==1){				
				break;
			}
			System.out.println(i);
		}
	}
}

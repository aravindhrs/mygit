package com.interview.basics;

public class SwitchStmt {
	public static void main(String[] args) {
		int num=10;	
		checkInt(num);
	}
	
	public static void checkInt(int num){
		switch (num) {
		case 10:
			System.out.println("10");
			break;
			
		case 20:
			System.out.println("20");
			break;
			
		case 30:
			System.out.println("30");
			break;

		default:
			System.out.println("No Match");
			break;
			
		case 40:
			System.out.println("40");
			break;
		}
		printText(num);
	}
	
	public static void printText(int num){
		switch (num) {
		case 10:
			System.out.println("value is 10");
			break;

		default:
			System.out.println("Not matched!!!");
			break;
		}
	}
}

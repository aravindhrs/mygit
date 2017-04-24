package com.interview.basics;

public class SwitchString {

	public static void main(String[] args) {
		String monthName="january";
		int monthNumber=printMonthValue(monthName);
		if(monthNumber==0)
			System.out.println(" is InValid Month");
		else
			System.out.println(" is Valid month");
	}
	
	public static int printMonthValue(String monthName){
		int month=0;		
		if(monthName==null)
			return month;
		
		switch (monthName.toLowerCase()) {
			case "january":
				System.out.print("Month January");
				month=1;
				break;
				
			case "february":
				month=2;
				break;
				
			case "march":
				month=3;
				break;
				
			case "april":
				month=4;
				break;
	
			default:
				month=0;
				break;
		}
		return month;
	}

}

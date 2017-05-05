package com.interview.basics;

import java.util.Arrays;

public class ArrayConversion {
	public static void main(String[] args) {
		String[] strArr = {"Hello"," ","Java"," ","Programming","!!!"};
		int[] intArr={2,3,4,5,6,7,8};
		Object[] objArr = {strArr,intArr};
		for(Object object:objArr){
			if(object instanceof String[]){
				String[] strArray=(String[]) object;
				System.out.println("-----String type-------");
				System.out.println(Arrays.toString(strArray).replaceAll(",  ,", "").replace(",", ""));
			}else if(object instanceof int[]){
				int[] intArray=(int[])object;
				System.out.println("-----Integer type------");
				System.out.println(Arrays.toString(intArray));
			}else{
				System.out.println("Unidenitifed type!!!");
			}
		}
	}
}

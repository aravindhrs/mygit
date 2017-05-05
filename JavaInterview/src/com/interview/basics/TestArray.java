package com.interview.basics;

public class TestArray {
	public static void minValue(int arr[]){
		int minValue = arr[0];
		for(int i=0;i<arr.length;i++){
			if(minValue>arr[i])
				minValue=arr[i];
		}
		System.out.println("Minimum Value in array is: "+minValue);
	}
	public static void main(String[] args) {
		int a[] = {10,2,6,5,7,12};
		minValue(a);
	}
}

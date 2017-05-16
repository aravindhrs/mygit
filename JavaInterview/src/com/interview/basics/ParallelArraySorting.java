package com.interview.basics;

import java.util.Arrays;

public class ParallelArraySorting {
	public static void main(String[] args) {
		int[] arr = { 5, 8, 7, 0, 6, 9 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		//Arrays.parallelSort(arr,0,3);
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

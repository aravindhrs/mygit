package com.interview.basics;

import java.util.ArrayList;
import java.util.List;

public class NullCheck {
	public static void main(String[] args) {
		List<String> list1 = null;
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list2.equals(list1));
	}
}

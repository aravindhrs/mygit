package com.interview.strings;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinEmpty {
	public static void main(String[] args) {
		String s1="HI";
		String[] str1={"A","B","C"};
		String str2="";
		if(!s1.isEmpty())
			str2=String.join("-", "A","B","C");
		s1=String.join("^", str1);
		System.out.println(str2);
		System.out.println(s1);
		
		List<String> strList = Arrays.asList(str1);
		//strList.addAll(0, Arrays.asList(str1));
		
		String joinedList=String.join("#", strList);
		System.out.println(joinedList);
		
		StringJoiner joiner=new StringJoiner("','","['","']");
		joiner.add("Hi").add("Java").add("Program");
		System.out.println(joiner.toString());
		
		List<Person> personList = Arrays.asList(
				new Person("Aravindh", "Ravi"),
				new Person("Akalya", "Ravi"),
				new Person("Shakthi", "Ravi")
				);
		
		String joinedFirstNames = personList.stream()
				.map(Person::getfName)
				.collect(Collectors.joining("','","['","']"));
		System.out.println(joinedFirstNames);
	}
}

package com.interview.collectionspkg;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableIntf {
	public static void main(String[] args) {
		ArrayList<ComaparableStudent> arrayList = new ArrayList<>();
		arrayList.add(new ComaparableStudent(10, 28, "Aravindh"));
		arrayList.add(new ComaparableStudent(13, 25, "Jeyashri"));
		arrayList.add(new ComaparableStudent(12, 29, "Vidhubala"));
		arrayList.add(new ComaparableStudent(18, 27, "Suji"));
		arrayList.add(new ComaparableStudent(14, 26, "Rubika"));
		
		Collections.sort(arrayList);  
		for(ComaparableStudent st:arrayList){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}
}

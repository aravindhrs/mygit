package com.interview.collectionspkg;

import java.util.*;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {
	public static void main(String[] args) {
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("Week Days (allOf):" + set1);
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("Week Days (noneOf):" + set2);

		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		Iterator<days> iter = set.iterator();
		while (iter.hasNext())
			System.out.println("Specific days (of):"+iter.next());
	}
}

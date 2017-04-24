package com.interview.strings;

public class InternTest {
	int a=894;
	String b="text";
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String str = new String("Hello");
		String str1="Hello";
		String str2=str1.intern();
		//System.out.println(str==str1);
		//System.out.println(str1==str2);
		//System.out.println("--");
		String str3="Hello";
		//System.out.println(str1==str3);
		InternTest internTest = new InternTest();
		System.out.println(internTest.hashCode());
		//System.out.println("Org Hashcode:"+System.identityHashCode(internTest));//366712642
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		InternTest other = (InternTest) obj;
		if (a != other.a) {
			return false;
		}
		if (b == null) {
			if (other.b != null) {
				return false;
			}
		} else if (!b.equals(other.b)) {
			return false;
		}
		return true;
	}
	

	
}

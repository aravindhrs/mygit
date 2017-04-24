package com.interview.synchronization;

public class AnonymousTest {
	private int k=10;
	
	public static void chk(){
		System.out.println("Hi");
	}
	
	public void check() {
		System.out.println("Check class:"+k);
	}
	
	public static void main(String[] args) {
		AnonymousTest test = new AnonymousTest();
		test.anonymousIntf.check();
		test.check();
	}
	
	AnonymousIntf anonymousIntf = new AnonymousIntf() {
		
		@Override
		public void check1() {
			System.out.println("Check");
		}
		
		@Override
		public void check() {
			System.out.println("Check Inf:"+k);
		}		
	};
}

package com.interview.collectionspkg;

public class EnumTest {
	public static void main(String[] args) {
		for(WhoisRIR rir : WhoisRIR.values())
			System.out.println(rir.getRIRUrl());
	}
}

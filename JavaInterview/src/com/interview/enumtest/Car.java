package com.interview.enumtest;

public enum Car {
	lamborghini(900), tata(2), audi(50), fiat(15), honda(12);
	private int price;

	Car(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

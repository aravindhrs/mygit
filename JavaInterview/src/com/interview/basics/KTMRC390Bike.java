package com.interview.basics;

public class KTMRC390Bike extends AbstractBike{
	
	public KTMRC390Bike(){
		
	}

	public void drive() {
		System.out.println("Driving Speed 130 KMPH");
	}

	public void start() {
		System.out.println("Initial pickup 60 KMPH");
	}

	public void stop() {
		System.out.println("Chain drive, wet multi disk anti brake systems");
	}
	
	public void digitalMeter(){
		super.digitalMeter();
		System.out.println("Everything LED Display in KTM");
	}
	
	public static void main(String[] args) {
		KTMRC390Bike ktmrc390Bike = new KTMRC390Bike();
		ktmrc390Bike.start();
		ktmrc390Bike.drive();
		ktmrc390Bike.stop();
		ktmrc390Bike.digitalMeter();
	}

}

package com.interview.basics;

public abstract class AbstractBike {
	public abstract void drive();
	public abstract void start();
	public abstract void stop();
	
	public void digitalMeter(){
		System.out.println("LED Display in Bike");
	}
}

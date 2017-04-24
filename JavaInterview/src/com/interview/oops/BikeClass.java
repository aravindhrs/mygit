package com.interview.oops;

public class BikeClass {	
	public String brandName,modelName;
	
	public BikeClass(String brand, String model){
		this.brandName=brand;
		this.modelName=model;
	}
	
	public String getBikePrice(String brandName,String modelName){
		return "ShowRoom:2Lakhs, OnRoad:3Lakhs";
	}
}
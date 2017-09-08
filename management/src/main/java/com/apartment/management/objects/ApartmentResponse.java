package com.apartment.management.objects;

public class ApartmentResponse {
	
	private int id;
	private String apartmentName; 
	private int floors;
	private long oneBHK; 
	private long twoBHK;
	private long threeBHK;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public long getOneBHK() {
		return oneBHK;
	}
	public void setOneBHK(long oneBHK) {
		this.oneBHK = oneBHK;
	}
	public long getTwoBHK() {
		return twoBHK;
	}
	public void setTwoBHK(long twoBHK) {
		this.twoBHK = twoBHK;
	}
	public long getThreeBHK() {
		return threeBHK;
	}
	public void setThreeBHK(long threeBHK) {
		this.threeBHK = threeBHK;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}

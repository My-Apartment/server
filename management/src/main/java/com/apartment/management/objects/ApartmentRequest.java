package com.apartment.management.objects;

public class ApartmentRequest {

	private String apartmentName; 
	private int floors;
	private long oneBHK; 
	private long twoBHK;
	private long threeBHK;
	private String address;
	private String city;
	
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}

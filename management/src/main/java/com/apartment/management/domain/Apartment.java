package com.apartment.management.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="apartment")
public class Apartment {
	
	private int id;
	private String apartmentName; 
	private int floors;
	private long oneBHK; 
	private long twoBHK;
	private long threeBHK;
	private String address;
	private String city;
	private boolean retired;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="apartmentName")
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	
	@Column(name="floors")
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	@Column(name="oneBHK")
	public long getOneBHK() {
		return oneBHK;
	}
	public void setOneBHK(long oneBHK) {
		this.oneBHK = oneBHK;
	}
	
	@Column(name="twoBHK")
	public long getTwoBHK() {
		return twoBHK;
	}
	public void setTwoBHK(long twoBHK) {
		this.twoBHK = twoBHK;
	}
	
	@Column(name="threeBHK")
	public long getThreeBHK() {
		return threeBHK;
	}
	public void setThreeBHK(long threeBHK) {
		this.threeBHK = threeBHK;
	}
	
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//@Type(type="yes_no")
	@Column(name="retired",nullable=false)
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
}

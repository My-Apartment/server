package com.apartment.management.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="owner_table")
public class owner_table {

	private int ID;
	private String ownerName; 
	private int floors;
	private long emptyFlats; 
	private long fullFlats;
	private long apartmentID;
	private String apartmentDetails;
	private boolean retired;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	@Column(name="ownerName")
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Column(name="floors")
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	
	@Column(name="emptyFlats")
	public long getEmptyFlats() {
		return emptyFlats;
	}
	public void setEmptyFlats(long emptyFlats) {
		this.emptyFlats = emptyFlats;
	}
	
	@Column(name="fullFlats")
	public long getFullFlats() {
		return fullFlats;
	}
	public void setFullFlats(long fullFlats) {
		this.fullFlats = fullFlats;
	}
	
	@Column(name="apartmentID")
	public long getApartmentID() {
		return apartmentID;
	}
	public void setApartmentID(long apartmentID) {
		this.apartmentID = apartmentID;
	}
	
	@Column(name="apartmentDetails")
	public String getApartmentDetails() {
		return apartmentDetails;
	}
	public void setApartmentDetails(String apartmentDetails) {
		this.apartmentDetails = apartmentDetails;
	}
	
	@Column(name="retired",nullable=false)
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
	
}

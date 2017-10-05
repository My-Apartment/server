package com.apartment.management.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tenant")
public class tenant {
	
	private int ID;
	private String tenantFirstName; 
	private String tenantLastName; 
	private long flatNo;
	private long NoOfTenants; 
	private long ownerID;
	private long apartmentID;
	private String apartmentName;
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
	
	@Column(name="tenantFirstName")
	public String getTenantFirstName() {
		return tenantFirstName;
	}
	public void setTenantFirstName(String tenantFirstName) {
		this.tenantFirstName = tenantFirstName;
	}
	
	@Column(name="tenantLastName")
	public String getTenantLastName() {
		return tenantLastName;
	}
	public void setTenantLastName(String tenantLastName) {
		this.tenantLastName = tenantLastName;
	}
	
	@Column(name="flatNo")
	public long getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(long flatNo) {
		this.flatNo = flatNo;
	}
	
	@Column(name="NoOfTenants")
	public long getNoOfTenants() {
		return NoOfTenants;
	}
	public void setNoOfTenants(long noOfTenants) {
		NoOfTenants = noOfTenants;
	}
	
	@Column(name="ownerID")
	public long getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(long ownerID) {
		this.ownerID = ownerID;
	}
	
	@Column(name="apartmentID")
	public long getApartmentID() {
		return apartmentID;
	}
	public void setApartmentID(long apartmentID) {
		this.apartmentID = apartmentID;
	}
	
	@Column(name="apartmentName")
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	
	@Column(name="retired",nullable=false)
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
}
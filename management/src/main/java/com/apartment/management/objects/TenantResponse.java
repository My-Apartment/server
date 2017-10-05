package com.apartment.management.objects;

public class TenantResponse {

	private String tenantFirstName;
	private String tenantLastName;
	private String apartmentName;
	private long flatNo;
	private long NoOfTenants;
	private int apartmentID;
	private int ownerID;
	private boolean retired;

	public String getTenantFirstName() {
		return tenantFirstName;
	}
	public void setTenantFirstName(String tenantFirstName) {
		this.tenantFirstName = tenantFirstName;
	}
	public String getTenantLastName() {
		return tenantLastName;
	}
	public void setTenantLastName(String tenantLastName) {
		this.tenantLastName = tenantLastName;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public long getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(long flatNo) {
		this.flatNo = flatNo;
	}
	public long getNoOfTenants() {
		return NoOfTenants;
	}
	public void setNoOfTenants(long noOfTenants) {
		NoOfTenants = noOfTenants;
	}
	public int getApartmentID() {
		return apartmentID;
	}
	public void setApartmentID(int apartmentID) {
		this.apartmentID = apartmentID;
	}
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
	@Override
	public String toString() {
		return "TenantResponse tenantFirstName=" + tenantFirstName + ", tenantLastName=" + tenantLastName
				+ ", apartmentName=" + apartmentName + ", flatNo=" + flatNo + ", NoOfTenants=" + NoOfTenants
				+ ", apartmentID=" + apartmentID + ", ownerID=" + ownerID + ", retired=" + retired + " ";
	}
	
	
}
package com.mobile.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobiledatajparest")
public class Mobile {
	
	@Id
	private int mobileId;
	private String mobileName;
	private String mobileType;
	private int mobilePrice;
	private int mobileWarranty;
	private long mobileIMEINumber;
	
	//getters and setters
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public int getMobileWarranty() {
		return mobileWarranty;
	}
	public void setMobileWarranty(int mobileWarranty) {
		this.mobileWarranty = mobileWarranty;
	}
	public long getMobileIMEINumber() {
		return mobileIMEINumber;
	}
	public void setMobileIMEINumber(long mobileIMEINumber) {
		this.mobileIMEINumber = mobileIMEINumber;
	}
	
	//default constructor
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	
	//param constructor
	public Mobile(int mobileId, String mobileName, String mobileType, int mobilePrice, int mobileWarranty,
			long mobileIMEINumber) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileType = mobileType;
		this.mobilePrice = mobilePrice;
		this.mobileWarranty = mobileWarranty;
		this.mobileIMEINumber = mobileIMEINumber;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileType=" + mobileType
				+ ", mobilePrice=" + mobilePrice + ", mobileWarranty=" + mobileWarranty + ", mobileIMEINumber="
				+ mobileIMEINumber + "]";
	}
	
	

}

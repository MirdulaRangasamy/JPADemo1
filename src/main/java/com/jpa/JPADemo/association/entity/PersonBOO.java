package com.jpa.JPADemo.association.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//@Entity
public class PersonBOO {
	@Id
	private String aadharNo;
	private String name;
	private String mobile;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private VehicleBOO vehicle;
	public PersonBOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonBOO(String aadharNo, String name, String mobile) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.mobile = mobile;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public VehicleBOO getVehicle() {
		return vehicle;
	}
	public void setVehicle(VehicleBOO vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "PersonOO [aadharNo=" + aadharNo + ", name=" + name + ", mobile=" + mobile + "]";
	}
	
}

package com.jpa.JPADemo.association.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//@Entity
public class Person {
	@Id
	private String aadharNo;
	private String name;
	private String mobile;
	@ManyToOne
	private Vehicle vehicle;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String aadharNo, String name, String mobile, Vehicle vehicle) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.mobile = mobile;
		this.vehicle = vehicle;
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
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Person [aadharNo=" + aadharNo + ", name=" + name + ", mobile=" + mobile + ", vehicle=" + vehicle + "]";
	}
	
	
}

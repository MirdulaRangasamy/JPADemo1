package com.jpa.JPADemo.association.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@Entity
public class PersonUOM {
	@Id
	private String aadharNo;
	private String name;
	private String mobile;
	@OneToMany(targetEntity = Vehicle.class)
	private List<Vehicle> vList = new ArrayList<Vehicle>();
	public PersonUOM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonUOM(String aadharNo, String name, String mobile) {
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
	public List<Vehicle> getvList() {
		return vList;
	}
	public void setvList(List<Vehicle> vList)
	{
		this.vList = vList;
	}
	public void addvList(Vehicle vehicle) {
		this.vList.add(vehicle);
	}
	
}

package com.jpa.JPADemo.association.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//@Entity	
public class PersonMM {
	@Id
	private String aadharNo;
	private String name;
	private String mobile;
	
	@ManyToMany(targetEntity = VehicleMM.class)
	private List<VehicleMM> vList = new ArrayList<VehicleMM>();

	public PersonMM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonMM(String aadharNo, String name, String mobile) {
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

	public List<VehicleMM> getvList() {
		return vList;
	}

	public void setvList(List<VehicleMM> vList) {
		this.vList = vList;
	}

	public void addvList(VehicleMM vehicle)
	{
		this.vList.add(vehicle);
	}
	
	@Override
	public String toString() {
		return "PersonMM [aadharNo=" + aadharNo + ", name=" + name + ", mobile=" + mobile + ", vList=" + vList + "]";
	}
	
	
}

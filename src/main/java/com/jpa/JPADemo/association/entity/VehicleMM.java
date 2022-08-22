package com.jpa.JPADemo.association.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//@Entity
public class VehicleMM {
	@Id
	private int vehNo;
	private String brandName;
	private String color;
	
	@ManyToMany(mappedBy = "vList")
	private List<PersonMM> pList = new ArrayList<PersonMM>();

	public VehicleMM() {
		super();
	}

	public VehicleMM(int vehNo, String brandName, String color, List<PersonMM> pList) {
		super();
		this.vehNo = vehNo;
		this.brandName = brandName;
		this.color = color;
		this.pList = pList;
	}

	public int getVehNo() {
		return vehNo;
	}

	public void setVehNo(int vehNo) {
		this.vehNo = vehNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<PersonMM> getpList() {
		return pList;
	}

	public void setpList(List<PersonMM> pList) {
		this.pList = pList;
	}
	
	public void addPerson(PersonMM person)
	{
		this.pList.add(person);
	}
	
	@Override
	public String toString() {
		return "VehicleMM [vehNo=" + vehNo + ", brandName=" + brandName + ", color=" + color + ", pList=" + pList + "]";
	}
	
}

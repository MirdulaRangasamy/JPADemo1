package com.jpa.JPADemo.association.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class VehicleBOO {
	@Id
	private int vehNo;
	private String brandName;
	private double cost;
	@OneToOne
	private PersonBOO person;
	
	public VehicleBOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleBOO( int vehNo,String brandName, double cost) {
		super();
		this.brandName = brandName;
		this.vehNo = vehNo;
		this.cost = cost;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getVehNo() {
		return vehNo;
	}
	public void setVehNo(int vehNo) {
		this.vehNo = vehNo;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public PersonBOO getPerson() {
		return person;
	}
	public void setPerson(PersonBOO person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Vehicle [brandName=" + brandName + ", vehNo=" + vehNo + ", cost=" + cost + "]";
	}
}

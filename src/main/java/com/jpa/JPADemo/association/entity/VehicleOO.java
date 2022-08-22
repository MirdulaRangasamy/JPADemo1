package com.jpa.JPADemo.association.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
//@Entity
public class VehicleOO {
	@Id
	private int vehNo;
	private String brandName;
	private double cost;
	
	public VehicleOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleOO( int vehNo,String brandName, double cost) {
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
	
	@Override
	public String toString() {
		return "Vehicle [brandName=" + brandName + ", vehNo=" + vehNo + ", cost=" + cost + "]";
	}
}

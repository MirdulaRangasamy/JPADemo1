package com.jpa.JPADemo.association.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
//@Entity
public class Vehicle {
	@Id
	private int vehNo;
	private String brandName;
	private double cost;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehNo, String brandName, double cost) {
		super();
		this.vehNo = vehNo;
		this.brandName = brandName;
		this.cost = cost;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Vehicle [vehNo=" + vehNo + ", brandName=" + brandName + ", cost=" + cost + "]";
	}
	
	
}

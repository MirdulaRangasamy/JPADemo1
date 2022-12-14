package com.jpa.JPADemo.inheritence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEEDATA")  
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
//@Inheritance(strategy=InheritanceType.JOINED)  
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)  
public class Employee{  
	      
	@Id 
	@Column(name="EmpID")
	private int e_id;  
	private String e_name;  

	public Employee(int e_id, String e_name) {  
	    super();  
	    this.e_id = e_id;  
	    this.e_name = e_name;  
	}  
	  
	public Employee() {  
	    super();     
	}  
	  
	public int getE_id() {  
	    return e_id;  
	}  
	  
	public void setE_id(int e_id) {  
	    this.e_id = e_id;  
	}  
	   
	public String getE_name() {  
	    return e_name;  
	}  
  
	public void setE_name(String e_name) {  
	    this.e_name = e_name;  
	}  	  
}

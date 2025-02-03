package com.cust.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class customer {
	

    @Id
	int custId;
	String name;
	String address;
	int mobile;
	public customer() {
		
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "customer [custId=" + custId + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
	

}

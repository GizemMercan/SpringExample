package com.mkyong.customer.model;

import java.sql.Timestamp;

public class Customer 
{
	int custId;
	String name;
	String ssn;
	
	
	public Customer(int custId, String name, String ssn) {
		this.custId = custId;
		this.name = name;
		this.ssn = ssn;
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
	public String getSsn() {
		return ssn;
	}
	public void setAge(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Customer [SSN=" + ssn + ", custId=" + custId + ", name=" + name
				+ "]";
	}
	
	
}

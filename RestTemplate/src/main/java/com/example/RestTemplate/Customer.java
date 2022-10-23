package com.example.RestTemplate;

import lombok.Data;
@Data
public class Customer {

	private String CusId;
	private String Name;
	private String YearOfBirth;
	public String getCusId() {
		return CusId;
	}
	public void setCusId(String cusId) {
		CusId = cusId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getYearOfBirth() {
		return YearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}
	public Customer(String cusId, String name, String yearOfBirth) {
		super();
		this.CusId = cusId;
		this.Name = name;
		this.YearOfBirth = yearOfBirth;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [CusId=" + CusId + ", Name=" + Name + ", YearOfBirth=" + YearOfBirth + "]";
	}
	
	
	
}

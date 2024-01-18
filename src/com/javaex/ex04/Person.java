package com.javaex.ex04;

public class Person {
	
	private String name;
	private String ph;
	private String company;
	
	
	public Person(String name, String ph, String company) {
		super();
		this.name = name;
		this.ph = ph;
		this.company = company;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", ph=" + ph + ", company=" + company + "]";
	}
	
	
	
	
	
	
	
	
}

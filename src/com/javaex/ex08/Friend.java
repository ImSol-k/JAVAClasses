package com.javaex.ex08;

public class Friend {
	
	String name;
	String ph;
	String school;
	
	public Friend(String name, String ph, String school) {
		this.name = name;
		this.ph = ph;
		this.school = school;
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + " 핸드폰 : " + ph + " 학교 : " + school);
	}
	
	
}

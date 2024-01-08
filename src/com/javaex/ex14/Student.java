package com.javaex.ex14;

public class Student extends Person {
	
	private String schoolName;
	
	public Student() {
		System.out.println("Student");
	}
	public Student(String name, int age, String schoolName) {
		//부모클래스 생성자 호출
		super(name, age);
		//본인껀 본인생성자에서 해결
		this.schoolName = schoolName;
		System.out.println("Student3");
	}

	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "[이름=" + getName() + ", 나이=" + getAge() + ", 학교=" + schoolName + "]";
	}


	
}

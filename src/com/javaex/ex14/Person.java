package com.javaex.ex14;

public class Person {

	// 핗드
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person");
	}
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		System.out.println("Person2");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("========================================");
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("========================================");
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

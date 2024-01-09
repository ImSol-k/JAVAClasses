package com.javaex.ex01;

public class Person {
	
	private String name;
	private String hp;
	
	
	public Person() {
		super();
	}
	public Person(String name, String hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}

	public void showInfo() {
		System.out.println("#이름:" + getName() + ", #핸드폰:" + getHp());
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + "]";
	}
	
}

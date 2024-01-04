package com.javaex.ex06;

public class Goods {
	
	//필드
	String name;
	int price;
	
	//생성자
	//데이터를 메모리에 올리는 역할
	public Goods() {
		System.out.println("기본생성자");
	}
	public Goods(String name, int price) {	
		System.out.println("name, price입력 생성자");
		this.name = name;
		this.price = price;
	}
	public Goods(String name) {
		System.out.println("name만 입력 생성자");
		this.name = name;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}

package com.javaex.ex06;

public class Goods {
	
	//필드
	String name;
	int price;
	
	//생성자
	//데이터를 메모리에 올리는 역할
	//기본생성자
	public Goods() {
		System.out.println("Goods()");
	}
	//부가적인 일을 하는 생성자
	public Goods(String name) {
		System.out.println("Goods(name)");
		this.name = name;
	}
	//생성자 오버로딩
	public Goods(String name, int price) {	
		//기존에 있던 생성자 호출
		//생성자 제일 윗줄에 호출해야함
		this(name);
		System.out.println("Goods(name, price)");
		this.price = price;
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

package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		
	}
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//GetterSetter
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
	
	//출력
	public void ShopInfo() {
		System.out.println("상품명 : " + name + ", 가격 : " + price);
	}
	
}





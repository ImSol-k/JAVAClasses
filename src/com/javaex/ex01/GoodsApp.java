package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		camera.name = "니콘";
		camera.price = 400000;		
		computer.name = "LG그램";
		computer.price = 900000;		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println("- 상품이름 : \"" + camera.name + "\", 가격 : " + camera.price);
		System.out.println("- 상품이름 : \"" + computer.name + "\", 가격 : " + computer.price);
		System.out.println("- 상품이름 : \"" + cup.name + "\", 가격 : " + cup.price);
		
		
	}

}

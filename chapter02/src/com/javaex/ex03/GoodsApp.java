package com.javaex.ex03;


public class GoodsApp {

	public static void main(String[] args) {
		
		//private(캡슐화)
		Goods camera = new Goods();		
		camera.setName("니콘");	
		camera.setPrice(400000);
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);		
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		Goods sum = new Goods();
		//sum.sum();
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
		
	}

}

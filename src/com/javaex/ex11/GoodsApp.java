package com.javaex.ex11;

public class GoodsApp {
	
	//필드
	
	//생상지
	
	//메소드gs
	
	//일반메소드

	public static void main(String[] args) {
		
		System.out.println(Goods.count);
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString()); 
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("니콘", 400000);
		System.out.println(cup.toString());
		
		System.out.println(cup.getCount());
	}

}

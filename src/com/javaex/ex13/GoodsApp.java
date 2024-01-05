package com.javaex.ex13;

public class GoodsApp {

	public static void main(String[] args) {

		//클래스 배열 선언
		Goods[] goodsArray = new Goods[3];
		
		//데이터 입력
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);
		String line = "=================================";
		
		//배열대입
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		//지정해서 출력
		System.out.println("goodsArray[0].getName = " + goodsArray[0].getName());
		System.out.println("goodsArray[1].getPrice = " + goodsArray[1].getPrice());
		System.out.println(line);
		
		//for문으로 한꺼번에 출력
		for (int i = 0; i < goodsArray.length; i++) {
			System.out.println("goodsArray[" + i + "].getName = " + goodsArray[i].getName());
		}
		System.out.println(line);
		for (int i = 0; i < goodsArray.length; i++) {
			System.out.println("goodsArray[" + i + "].getPrice = " +goodsArray[i].getPrice());
		}
		System.out.println(line);
		for (int i = 0; i < goodsArray.length; i++) {
			System.out.println(goodsArray[i].toString());
		}
		System.out.println(line);
		for (int i = 0; i < goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}
		System.out.println(line);

	}

}

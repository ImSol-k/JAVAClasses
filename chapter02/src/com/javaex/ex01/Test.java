package com.javaex.ex01;

import com.javaex.ex01.Goods;

public class Test {

	public static void main(String[] args) {
		Goods good = new Goods();
		
		good.name = "니콘";
		good.price = 400000;
		
		System.out.println("상품이름 : " + good.name);
		System.out.println("상품가격 : " + good.price);

	}

}

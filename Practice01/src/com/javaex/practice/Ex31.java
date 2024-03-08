package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		//상품을 구매하면 정가의 10%를 부가세로 부여한다.
		//프로그램 작성하기
		
		Scanner inM = new Scanner(System.in);
		float price, money;
		
		System.out.print("상품가격 : ");
		price = inM.nextFloat();
		
		System.out.print("받은돈   : ");
		money = inM.nextFloat();
		
		System.out.println("===============================");
		System.out.println("받은돈   : " + money);
		System.out.println("상품가격 : " + price);
		System.out.println("부가세   : " + price / 10);
		System.out.println("잔액    : " + (money - price));
		
		inM.close();
		
	}

}

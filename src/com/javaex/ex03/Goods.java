package com.javaex.ex03;

import java.util.Scanner;

public class Goods {
	
	//필드
	private Scanner in = new Scanner(System.in);
	private String name;
	private String na = "상품이름 : ";
	private String pr = "가격 : ";
	private int price;
	
	//매개변수 있는 메소드
	public void setName(String n) {
		name = n;
	}
	public void setPrice(int p) {
		price = p;
	}
	
	//매개변수 없는 메소드
	public String GetName() {
		return name;
	}
	public int GetPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println(na + name);
		System.out.println(pr + price);
		System.out.println();
	}
	
	public void sum() {
		System.out.print("숫자 : ");
		int i = in.nextInt();
		System.out.println("+");
		System.out.print("숫자 : ");
		int j = in.nextInt();
		int result = i + j;
		System.out.println("결과 : " + result);
		System.out.println();
	}
}

package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		//원화를 달러화로 계산하는 프로그램을 작성하세요
		//환율 1달러 = 1230.95원 상수로 지정
		
		Scanner inD = new Scanner(System.in);
		final double w = 1230.95;
		double d;
		
		//출력
		System.out.print("환전할 원화를 입력하세요 : ");
		
		//입력
		d = inD.nextDouble();
		
		//출력
		System.out.println("받으실 달러는 " + (d / w));
		
		inD.close();
		
	}

}
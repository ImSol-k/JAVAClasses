package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		//반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요
		//파이값은 3.14 상수로 지정
		
		Scanner cc = new Scanner(System.in);
		final float PI = 3.14f;
		float c;
		
		
		//출력
		System.out.print("반지름을 입력하세요 : ");
		
		//반지름 입력
		c = cc.nextFloat();
		
		//출력
		System.out.println("원의 넓이는 " + (c * c) * PI);
		
		cc.close();
		

	}

}

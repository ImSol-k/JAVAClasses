package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		//사용자로부터 구의 반지금을 입력받아 구의 부피를 계산하는 프로그램작성
		
		Scanner in = new Scanner(System.in);
		double pi = 3.14;
		double radius, volume;
				
		System.out.print("반지름 : ");
		radius = in.nextDouble();
		
		volume = radius * radius * radius * pi * 4 / 3;
		System.out.println("구의 부피는 " + volume + " 입니다.");
		
		in.close();
				
		

	}

}

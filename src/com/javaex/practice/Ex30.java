package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		//마일을 km로 변환하는 프로그램을 ㅈ가성하세요
		//1마일 = 1.609km상수지정
		
		Scanner inM =  new Scanner(System.in);
		final double km = 1.609f;
		double m;
		
		//출력
		System.out.print("마일을 입력하세요 : ");
		
		//입력
		m = inM.nextDouble();
		
		//출력
		System.out.println(m + "마일은" + (m * km) +  "킬로미터 입니다.");
		
		
		inM.close();
		
		

	}

}

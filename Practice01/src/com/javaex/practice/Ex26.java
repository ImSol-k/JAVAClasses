package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		//월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요
		
		Scanner inMon = new Scanner(System.in);
		int tenYears = 120;
		int mon;
				
		//출력
		System.out.print("월급을 입력하세요 : ");
		//월급입력
		mon = inMon.nextInt();
		//출력
		System.out.println("10년동안 최대 저축액은 " + mon * tenYears + "원 입니다.");
		inMon.close();
	}

}

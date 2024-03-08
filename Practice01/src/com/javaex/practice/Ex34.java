package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		//화씨온도를 입력받아 섭씨온도로 변환하는 프로그램 작성
		//화씨 -> 섭씨 : ℃ = 5/9 * (℉ - 32) 
		//섭씨 -> 화씨 : ℉ = (℃ * 9/5) + 32

		Scanner in = new Scanner(System.in);
		double f, c;
		
		System.out.print("화씨 : ");
		f = in.nextDouble();
		
		c = (f - 32) / 9 * 5;
		System.out.println("화씨 " + f + "의 섭씨온도는" + c + " 입니다.");
		
		in.close();

	}

}

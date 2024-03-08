package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		//가로, 세로값을 입력받아 삼각형의 넓이를 구하는 프로그램 작성
		
		Scanner in = new Scanner(System.in);
		double width, height;
		
		System.out.print("가로 : ");
		width = in.nextDouble();
		System.out.print("세로 : ");
		height = in.nextDouble();
		
		System.out.println("삼각형의 넓이는 " + (width * height / 2) + " 입니다.");
		
		in.close();

	}

}

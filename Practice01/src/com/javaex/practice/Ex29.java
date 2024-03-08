package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		//직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요
		//가로, 세로 변수 double형으로 작성
		Scanner in = new Scanner(System.in);
		double w, h;
		
		//출력
		System.out.print("가로를 입력하세요 : ");
		//가로입력
		w = in.nextDouble();
		//출력
		System.out.print("세로를 입력하세요 : ");
		//세로입력
		h = in.nextDouble();
		//넓이, 둘레출력
		System.out.println("사각형의 넓이는 " + w * h);
		System.out.println("사각형의 둘레는 " + (w + h) * 2);
		
		in.close();
		
	}

}

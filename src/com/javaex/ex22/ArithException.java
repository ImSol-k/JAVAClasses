package com.javaex.ex22;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double result;
		int num;
		
		num = in.nextInt();
		
		//예외처리
		//try~catch문
		try {
			//예외처리할 실행문
			result = 100 / num;
			System.out.println(result);
			
			//예외 타입선언 타입에 이름 붙여주기
		}catch(ArithmeticException e){
			
			//예외타입 출력
			System.out.println(e.toString());
			//예외처리문
			System.out.println(num + "으로 나눌 수 없습니다");
			
		}
		//finally(생략가능)
//		finally {
//			System.out.println("finally영역");
//		}
			
		System.out.println("프로그램 종료");
		
		in.close();
	}

}

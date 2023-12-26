package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		//다음중 결과값이 다른것을 선택하고 이유를 설명해 보세요
		
		System.out.println(13 / 5);						//(1)
		//정수와 정수를 계산하면 계산값도 정수
		
		System.out.println((double)13 / 5);				//(2)
		
		System.out.println(13 / (double)5);				//(3)
		
		System.out.println((double)13 / (double)5);		//(4)
		
		System.out.println(13.0 / 5);					//(5)
		
		System.out.println(13 / 5.0);					//(6)
		
		System.out.println((double)(13 / 5));			//(7)
		//정수와 정수를 계산하고 자료형을 변경했기때문에 소수점이 0으로나옴
		
		
		

	}

}

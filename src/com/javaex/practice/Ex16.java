package com.javaex.practice;

public class Ex16 {

	public static void main(String[] args) {
		
		//아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 확인해보세요
		
		int x = 1;
		int y = 1;
		
		int a = ++x * 2;
		int b = y++ * 2;
		
		System.out.println("a = " + a);
		//예상 : 2 * 2
		//예상값 : 4, 결과값 : 4
		System.out.println("b = " + b);
		//예상 : 1 * 2
		//예상값 :2 , 결과값 : 2
		
		System.out.println("x = " + x);
		//예상 : ++1
		//예상값 : 2, 결과값 : 2
				
		System.out.println("y = " + y);
		//예상 : 1++
		//예상값 : 2, 결과값 : 2
				
		

	}

}

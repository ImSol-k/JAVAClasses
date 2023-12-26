package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {
		
		//정수형 변수				
		//byte형
		byte no = 127;		
		System.out.println(no);
		
		//int형
		int num = 2147483647;
		System.out.println(num);
		
		//long형
		//long형에는 접미사L이 붙음
		//int형 범위 내의 숫자에는 안붙여도 상관x
		long num2 = 9223372036854775807L;	
		System.out.println(num2);
		
		//같은 자료형끼리는 한꺼번에 선언 할 수 있다.
		int var01, var02, var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		//사용하지 않은 메모리에대해서는 경고해줌
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		//선언과 초기화도 한꺼번에 가능
		int var04 = 100, var05 = 200, var06 = 300;
		
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);
		
		//sysout + ctrl +space = System.out.println		
		
	}

}

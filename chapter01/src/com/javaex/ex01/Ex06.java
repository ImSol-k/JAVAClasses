package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//상수(Constant)
		//변하지 않는 수 고정값
		//변수의 경우
		double pi = 3.14;
		double result = pi * 5 * 5;
		
		System.out.println(pi);
		System.out.println(result);
		
		pi = 3.1415;
		double circleArea = pi * 5 * 5; 
		
		System.out.println(circleArea);

		//상수의 경우
		//자료형 앞에 final붙여준다
		//상수의 이름은 대문자로 사용
		final double PI = 3.14;
		double result2 = PI * 5 * 5;
		//PI = 3.1415;	//final이 붙은 상수값은 변경 안됨
		
		System.out.println(PI);
		System.out.println(result2);
		
		circleArea = PI * 5 * 5;
		
		System.out.println(circleArea);
		
		
		
	}

}

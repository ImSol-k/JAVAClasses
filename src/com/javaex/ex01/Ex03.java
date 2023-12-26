package com.javaex.ex01;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//실수형 변수
		double var01 = 3.14;
		float var02 = 3.14f; //float형은 접미사f(대소문자 상관x)
		
		System.out.println(var01);
		System.out.println(var02);
		
		//같은수를 넣었을때 다른값이 나오는 경우
		//double형이 저장할수 있는 크기가 크기때문에 더 정밀한 값이 나옴
		double var03 = 0.12345678901234567890;
		float var04 = 0.12345678901234567890f;
		
		//나오는 소수점 자리수가 다름
		System.out.println(var03);
		System.out.println(var04);
		
		
	}

}

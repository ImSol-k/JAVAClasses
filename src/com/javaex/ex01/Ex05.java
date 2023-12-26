package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		//문자형 변수
		//char형은 ''작은따옴표 사용
		//따옴표 안에 있는 숫자는 글자로인식 계산할 수 없다.
		//char ch = "솔"	//큰 따옴표는 사용 불가
		char ch01 = 'A';
		char ch02 = '한';
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		//유니코드 값을 대입 할 수 있다
		//숫자가 들어가면 유니코드로 인식해서 수에 해당하는 코드값 출력
		char ch03 = 65;
		char ch04 = 99;
		
		System.out.println(ch03);
		System.out.println(ch04);	
		
		//문자열(String)
		//참조자료형은 첫글자가 대문자
		//""쌍따옴표로 문자를 묶어줌(한글자 사용시에도 쌍따옴표사용)
		//가장 많이 쓰임..
		String name = "김소리";
		String nm = "솔";
		
		System.out.println(name);
		System.out.println(nm);
		
	}

}

package com.javaxe.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		//코드 오류찾기
		
		int age = 15;
		/*
		//age가 0살 초과이고 18미만이면
		if(0 < age < 18) {
			System.out.println("청소년입니다");
		}
		*/
		
		//삼항 비교 불가 논리연산자 사용해야함
		if(0 < age && age < 18) {
			System.out.println("청소년입니다.");
		}
		
		

	}

}

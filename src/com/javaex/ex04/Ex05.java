package com.javaex.ex04;


public class Ex05 {

	public static void main(String[] args) {
		
		//1부터 10까지의 합을 구하는 프로그램 작성
		
		int num = 0;
		
		
		for(int i = 1; i <= 10; i++) {
			
			num = i + num;
			
			System.out.println(i + "까지의 합은 " + num);
			
		}
		
		System.out.println("1부터 10까지의 정수의 합은 " + num + "입니다.");

	}

}

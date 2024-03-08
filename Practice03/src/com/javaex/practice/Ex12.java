package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//숫자 한개를 입력받아 팩토리얼값 출력
		
		Scanner in = new Scanner(System.in);
		int num, result = 1;
		
		System.out.println("숫자를 입력하세요");
		num = in.nextInt();
		for(int i = 1; i <= num; i++) {
			result = i * result;
		}
		
		System.out.println("결과값 : " + result);
		in.close();	
		
	}

}

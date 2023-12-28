package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		//숫자 한개를 입력받아 5의배수의 개수와 합을 출력하는 프로그램 작성
		
		Scanner in = new Scanner(System.in);
		int num, result = 0;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = in.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 5 == 0) {
				result = i + result;
				sum++;
				
			}
		}
		System.out.println("5의배수의 개수: " + sum);
		System.out.println("5의배수의 합 : " + result);
		
		in.close();
	}

}

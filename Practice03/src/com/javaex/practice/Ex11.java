package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		//*입력받은수가 홀수인경우 입력값까지 홀수합만 출력
		//*입력받은수가 짝수면 입력값까지 짝수합만 출력
		
		Scanner in = new Scanner(System.in);
		int num, sum = 0;
				
		System.out.println("숫자를 입력하세요");
		num = in.nextInt();
		
		//짝수일 경우
		if(num % 2 == 0) {
			for(int i = 1; i <= num; i++) {
				if(i % 2 == 0) {
					sum = sum + i;
				}
				else {
					continue;
				}
			}
		}
		
		//홀수일 경우
		else {
			for(int i = 1; i <= num; i++) {
				if(i % 2 != 0) {
					sum = sum + i;
				}
				else {
					continue;
				}
			}
		}
		
		System.out.println("결과값 : " + sum);
		
		in.close();
		
	}

}

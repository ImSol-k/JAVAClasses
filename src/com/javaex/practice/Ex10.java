package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		//정수 다섯개를 입력받아 가장 큰 수 출력
		
		Scanner in = new Scanner(System.in);
		int num;
		int big = 0;
		
		System.out.println("숫자를 입력하세요");
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.print("숫자 : ");
			num = in.nextInt();
			
			if(num < big) {
				big = big;
			}
			else {
				big = num;
			}
			
		}
		System.out.println("최대값은 " + big + "입니다.");
		
		in.close();
	}

}

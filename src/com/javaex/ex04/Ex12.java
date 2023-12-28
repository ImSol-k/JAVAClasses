package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//do while
		//숫자를 입력받아 더하는 프로그램 작성하기
		//0이면 종료
		
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num;
			
		System.out.println("숫자를 입력하세요. (0이면 종료)");
		
		do {
			
			num = in.nextInt();
			
			if(num == 0) {
				System.out.println("종료");
				break;
			}
			sum = num + sum;
			System.out.println("합계 : " + sum);
			System.out.println("==========");
			
		}while(true);
		
	}

}

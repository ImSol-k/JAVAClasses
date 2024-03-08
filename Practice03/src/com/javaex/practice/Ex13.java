package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		//숫자 한개를 입력받아 입력한 숫자까지의 누적 합계 구하는 프로그램 작성
		
		Scanner in = new Scanner(System.in);
		int num, sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = in.nextInt();
		for(int i = 1; i <= num; i++) {
			sum = i + sum;
		}
		
		System.out.println("합계 : " + sum);

		in.close();
	}

}

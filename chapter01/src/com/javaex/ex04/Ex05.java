package com.javaex.ex04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//1부터 10까지의 합을 구하는 프로그램 작성
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num;
		
		System.out.print("합할 정수 입력 : ");
		num = in.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			
			sum = i + sum;
						
		}
		
		System.out.println("1부터 " + num + "까지의 정수의 합은 " + sum + "입니다.");
		
		in.close();
		
	}

}

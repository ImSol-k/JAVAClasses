package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean start = true;
		int num, sum = 0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		
		while(start) {
			
			num = in.nextInt();
			sum = num + sum;
			System.out.println("합계 : " + sum);
			
			if(0 == num) {
				start = false;
			}
		}
		
		System.out.println("종료");
		
		
		in.close();
		
	}

}

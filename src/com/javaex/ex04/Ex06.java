package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num;
		
		System.out.print("합할 정수 입력 : ");
		num = in.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			sum = i + sum;
			
			System.out.println(i + "까지의 합은" + sum);
		}
		
		
		
	}

}

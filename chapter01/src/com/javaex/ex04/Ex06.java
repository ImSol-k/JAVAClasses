package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int start = 1;
		int num;
		
		System.out.print("합할 정수 입력 : ");
		num = in.nextInt();
		
		for(int i = start; i <= num; i++) {
			
			sum = i + sum;
			
			System.out.println(i + "까지의 합은" + sum);
		}
		
		System.out.println(start + "부터 " + num + "까지의 정수의 합은 " + sum + "입니다.");
		in.close();
	}

}

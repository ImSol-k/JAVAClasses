package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num, sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		num = in.nextInt();
		for(int i = 1; i <= num; i++) {
			sum = i + sum;
			System.out.print(i);
			if(i != num) {
				System.out.print("+");
			}
			else {
				System.out.println();
			}
		}
		
		System.out.println("합계 : " + sum);
		
		
		in.close();
	}

}

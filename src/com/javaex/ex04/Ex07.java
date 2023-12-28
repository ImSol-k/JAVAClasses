package com.javaex.ex04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//2단부터 시작
		int dan1, dan2;
		int sum;
		
		System.out.print("몇단부터 출력? : ");
		dan1 = in.nextInt();
		System.out.print("몇단까지 출력? : ");
		dan2 = in.nextInt();
		
		//총 dan2단까지 출력한다
		for(int i = dan1; i <= dan2; i++) {
			
			//곱셈연산하는 for문
			for(int j = 1; j <= 9; j++) {
			sum = dan1 * j;
			System.out.println(dan1 + " * " + j + " = " + sum);			
			}
			
			//한 단이 끝날때마다 dan1+1, 개행
			dan1++;
			System.out.println();
		}
		
		in.close();
	}

}

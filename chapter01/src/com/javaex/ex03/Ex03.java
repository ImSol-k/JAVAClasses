package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		num = in.nextInt();
		
		if(0 < num) {
			System.out.println("양수");
		}
		else if (0 > num) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
		
		in.close();

	}

}

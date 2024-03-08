package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하세요 : ");
		num = in.nextInt();
		
		for(int i = 0; i <= num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			if (i != num) {
				System.out.println();
			}
			else {
				continue;
			}
		}
		
		for(int i = 1; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}

}

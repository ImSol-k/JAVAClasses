package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		//숫자 하나를 입력받아 *출력
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하세요 : ");
		num = in.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		in.close();
	}

}

package com.javaxe.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		//정수 3개를 입력받아 가장 작은 수 출력하기
		
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, small;
		
		System.out.print("숫자1 : ");
		num1 = in.nextInt();
		System.out.print("숫자2 : ");
		num2 = in.nextInt();
		System.out.print("숫자3 : ");
		num3 = in.nextInt();
		
		if(num1 < num2) {
			if(num1 < num3) {
				small = num1;
			}
			else {
				small = num3;
			}
		}
		else {
			if(num2 < num3) {
				small = num2;
			}
			else {
				small = num3;
			}
		}
		System.out.println("가장 작은수는" + small + " 입니다.");

	}

}

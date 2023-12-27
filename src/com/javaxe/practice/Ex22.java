package com.javaxe.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		//숫자(정수)3개를 입력받아 가장 큰 수 출력
		Scanner in = new Scanner(System.in);
		int num1, num2, num3, big;
		
		System.out.println("숫자 3개를 입력해 주세요");
		System.out.print("숫자1 : ");
		num1 = in.nextInt();
		System.out.print("숫자2 : ");
		num2 = in.nextInt();
		System.out.print("숫자3 : ");
		num3 = in.nextInt();
		
		if(num1 > num2) {
			if(num1 > num3) {
				big = num1;
			}
			else {
				big = num3;
			}
		}
		else {
			if(num2 > num3) {
				big = num2;
			}
			else {
				big = num3;
			}
		}
		System.out.println("가장 큰 수는 " + big + " 입니다.");
		
		in.close();
	}

}

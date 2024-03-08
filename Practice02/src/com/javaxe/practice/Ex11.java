package com.javaxe.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		//두개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램 작성
		Scanner in = new Scanner(System.in);
		int num1, num2, share, rest;
		
		System.out.print("첫번째 숫자 : ");
		num1 = in.nextInt();
		System.out.print("첫번째 숫자 : ");
		num2 = in.nextInt();
		
		if(num1 > num2) {
			share = num1 / num2;
			rest = num1 % num2;
		}
		else {
			share = num2 / num1;
			rest = num2 % num1;
		}
		
		System.out.println("몫 : " + share + "\n나머지 : " + rest);
		
		
		in.close();
	}

}

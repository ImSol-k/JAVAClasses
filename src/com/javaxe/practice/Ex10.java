package com.javaxe.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		//두개의 수를 입력받아 큰수와 작은수 분류해서 출력
		
		Scanner in = new Scanner(System.in);
		int num1, num2, big, small;
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1 : ");
		num1 = in.nextInt();
		System.out.print("숫자2 : ");
		num2 = in.nextInt();
		
		if(num1 < num2) {
			big = num2;
			small = num1;
		}
		else {
			big = num1;
			small = num2;
		}
		
		System.out.println("큰수 : " + big + "\t작은수 : " + small + " 입니다.");
		
		in.close();
		

	}

}

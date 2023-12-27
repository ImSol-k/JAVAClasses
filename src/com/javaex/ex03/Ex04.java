package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		//조건문(switch)
		//조건식이 모두 ==일때 사용

		Scanner in = new Scanner(System.in);
		//int code;
		char co;

		System.out.println("과목코드를 입력하세요");
		System.out.println("1(A).자바  2(B).C  3(C).C++  4(D).파이썬");
		System.out.print("과목코드 : ");
		co = in.next().charAt(0);

		switch (co) {
			case 'A':
			case 'a':
				System.out.println("R101호");
				break;
				
			case 'B':
			case 'b':
				System.out.println("R202호");
				break;
				
			case 'C':
			case 'c':
				System.out.println("R303호");
				break;
				
			case 'D':
			case 'd':
				System.out.println("R404호");
				break;
				
			default:
				System.out.println("상담원에게 문의하세요");
				break;
				
		}

		in.close();
	}

}

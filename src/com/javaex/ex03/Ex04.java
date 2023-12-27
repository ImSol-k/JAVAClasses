package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 조건문(switch)
		//

		Scanner in = new Scanner(System.in);
		int code;

		System.out.println("과목코드를 입력하세요");
		System.out.println("1.자바  2.C  3.C++  4파이썬");
		System.out.print("과목코드 : ");
		code = in.nextInt();

		switch (code) {
			case 1:
				System.out.println("R101호");
				break;
			case 2:
				System.out.println("R202호");
				break;
			case 3:
				System.out.println("R303호");
				break;
			case 4:
				System.out.println("R404호");
				break;
			default:
				System.out.println("상담원에게 문의하세요");
				break;
		}

		in.close();
	}

}

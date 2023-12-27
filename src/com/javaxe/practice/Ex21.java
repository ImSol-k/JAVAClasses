package com.javaxe.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		//사번(양의정수)을 입력하면 팀을 확인 할 수 있는 프로그램 작성
		//*팀은 A, B, C팀으로 구성
		//*팀을 3으로 나누어서 나머지가 0이면A, 1이면 B,2이면 C로 구분 
		//*사번 0을 입력하면 "잘못된 사번입니다." 출력
		
		Scanner in = new Scanner(System.in);
		int code;
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번 : ");
		code = in.nextInt();
		
		if(code % 3 == 0 && code != 0) {
			System.out.println("A팀입니다.");
		}
		else if(code % 3 == 1) {
			System.out.println("B팀입니다.");
		}
		else if(code % 3 == 2) {
			System.out.println("C팀입니다.");
		}
		else {
			System.out.println("잘못된 사번입니다.");
		}
		
		
		in.close();
		
	}

}

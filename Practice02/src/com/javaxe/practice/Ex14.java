package com.javaxe.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		//사번(양의정수)을 입력하면 팀을 확인 할 수 있는 프로그램 작성
		//*팀은 A, B, C 3개의팀으로 구성한다
		//*사번을 3으로 나누어서 나머지가 0이면A, 1이면 B, 2면 C팀으로 구분
		//0번은 고려하지 않는다
		
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번 : ");
		num = in.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("A팀입니다.");
		}
		else if(num % 3 == 1) {
			System.out.println("B팀입니다.");
		}
		else if(num % 3 == 2) {
			System.out.println("C팀입니다.");
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		
		
		
		in.close();
		
	}

}

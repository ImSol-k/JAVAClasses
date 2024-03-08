package com.javaex.ex04;

import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		
		//숫자를 입력받아 3의 배수인지 판별하는프로그램 작성
		//0 입력이 들어오면 프로그램 종료
				
		Scanner in = new Scanner(System.in);
		int num;
				
		while(true) {
			
			System.out.println("====================");
			System.out.println("숫자를 입력하세요");
			num = in.nextInt();
			
			if(num == 0) {
				System.out.println("종료");
				break;
			}
			if(num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			}
			else {
				System.out.println("3의 배수가 아닙니다.");
			}		
			
		}
		
		
		
		in.close();
		
	}

}

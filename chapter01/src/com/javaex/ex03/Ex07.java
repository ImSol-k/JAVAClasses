package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int mon;
		
		System.out.println("월을 입력하세요");
		mon = in.nextInt();
		
		if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
			System.out.println("31일 입니다");
		}
		else if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			System.out.println("30일 입니다");
		}
		else if(mon == 2) {
			System.out.println("28일 입니다");
		}
		else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		in.close();
		
	}

}

package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// Scanner준비
		Scanner sc = new Scanner(System.in);

		// 안내문구
		System.out.println("이름을 입력하세요.");

		// 이름 :
		System.out.print("이름 : ");

		// 이름 입력받기
		String name = sc.nextLine();

		// 안내문구
		System.out.println("나이를 입력하세요.");

		// 나이 :
		System.out.print("나이  : ");

		// 나이 입력받기
		byte age = sc.nextByte();

		// 안내문구
		System.out.println("키를 입력하세요.");

		// 출력
		System.out.print("키 : ");

		// 키 입력받기
		float h = sc.nextFloat();

		// 출력
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 키는 " + h + "cm입니다.");

		// 테스트용
		// System.out.println(h);

		// Scanner종료
		sc.close();

	}

}

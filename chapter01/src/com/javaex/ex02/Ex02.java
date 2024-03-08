package com.javaex.ex02;

//import - 외부에있는 클래스 불러오기
import java.util.Scanner; //Scanner참조

public class Ex02 {

	public static void main(String[] args) {

		// Scanner(콘솔입력)
		// 사용자입력 받아오는 클래스
		// 참조형! 변수에 값이 아닌 주소를 저장함
		// 참조형은 클래스로 정의되어있기떄문에 변수선언할때도 잠조자료형은 대문자로 시작한다.
		// System.in - 키보드 입력 받아오는 클래스
		Scanner sc = new Scanner(System.in);
		String name;
		int age;

		// 출력
		System.out.println("=================================");
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름 : ");
		// 입력
		name = sc.nextLine();
		// 출력
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		// 입력
		age = sc.nextInt();
		// 결과출력
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + "살 입니다.");
		System.out.println("=================================");
		sc.close(); // 세트로 항상 달아주기

	}

}

package com.javaxe.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//나이 입력시 결과값 예상하기
		Scanner in = new Scanner(System.in);
		int age;
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이 : ");
		age = in.nextInt();
		
		if(age > 20) {
			System.out.print("\"1번그룹\"");
		}
		else {
			System.out.print("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		in.close();
		//(1)15 - 예상 : "2번그룹"입니다. 결과 : "2번그룹"입니다.
		//(2)19 - 예상 : "2번그룹"입니다. 결과 : "1번그룹"입니다.
		//(3)20 - 예상 : "2번그룹"입니다. 결과 : "1번그룹"입니다.
		//(4)21 - 예상 : "1번그룹"입니다. 결과 : "1번그룹"입니다.
		//(5)100 - 예상 : "1번그룹"입니다. 결과 : "1번그룹"입니다.
		
	}

}

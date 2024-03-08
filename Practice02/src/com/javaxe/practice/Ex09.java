package com.javaxe.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		//조건과같이 출력되도록 프로그램작성
		//*태어난 년도 입력받기
		//*나이는 생일과 관계 없이 계산된다 23년기준 20년생 3살
		//*15세미만의 경우와 65세 이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다." 메세지 출력
		//*이외의 경우에는 "(나이)살 무료예방접종 대상자가 아닙니다."메세지 출력
		
		Scanner in = new Scanner(System.in);
		int year = 2023;
		int birth, age;
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도 : ");
		birth = in.nextInt();
		
		age = year - birth;
		System.out.print(age + "살 ");
		
		if(age < 15 || age >= 65) {
			System.out.println("무료예방접종 대상자 입니다.");
		}
		else {
			System.out.println("무료예방접종 대상자가 아닙니다.");
		}
		
		
		in.close();
		
		

	}

}

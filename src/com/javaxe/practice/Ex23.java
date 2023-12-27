package com.javaxe.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		//*태어난 년도 입력받기
		//*나이는 생일과 관계 없이 계산됨 (올해 - 출생년도)
		//*성인(20세이상)이면 무료로 건강검진 받을 수 있음
		//*짝수해 태어난 사람은 올해가 짝수이면 검사대상
		//*홀수해 태어난사람은 올해가 홀수이면 검사대상
		//*40세 이상의 경우에는 암검사도 무료로 받을 수 있다.
		
		Scanner in = new Scanner(System.in);
		int year = 2023;
		int birth, age;
		boolean adult, even;
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도 : ");
		birth = in.nextInt();
		age = year - birth;
		System.out.println("올해 : " + year);
		System.out.println("태어난해 : " + birth);
		System.out.println("나이 : " + age);
		System.out.println("===============================");
		
		adult = age >= 20;
		even = birth % 2 == 0;
		
		if(adult) {
			System.out.println("20살 이상");
		}
		else {
			System.out.println("20살미만 건강검진대상이 아님");
		}
		
		if(even) {
			if(year % 2 == 0) {
				System.out.println("건강검진해");
			}
			else {
				System.out.println("건강검진해아님");
			}
		}
		else {
			if(year % 2 == 1){
				System.out.println("건강검진해");
			}
			else {
				System.out.println("건강검진해아님");
			}
		}
		
		if(age >= 40){
			System.out.println("암 검사");
		}
		else {
			System.out.println("암 검사 X");
		}
		
		in.close();
	}

}

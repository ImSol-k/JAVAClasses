package com.javaxe.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		//나이를 입력받아 19세 이상 65세 미만이면 "1번그룹"
		//이외에는 "2번그룹"으로 출력하는 프로그램 작성
		
		Scanner in = new Scanner(System.in);
		String group;
		int age;
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이 : ");
		age = in.nextInt();
		if(age >= 19 && 65 > age) {
			group = "1번 그룹";
		}
		else {
			group = "2번 그룹";
		}
		
		System.out.println(group + " 입니다");
		
		in.close();
	}

}

package com.javaxe.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s;
		String mon;
		int age;
		
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이 : ");
		age = in.nextInt();
		
		if(age >= 0 && 7 >= age) {
			s = "취학전아동/";
			mon = "/무료";
		}
		else if(age >= 8 && 13 >= age) {
			s = "초등학생/";
			mon = "/2000원 ";
		}
		else if(age >= 14 && 16 >= age) {
			s = "중학생/";
			mon = "/3000원 ";
		}
		else if(age >= 17 && 19 >= age) {
			s = "고등학생/";
			mon = "/4000원 ";
		}
		else {
			s = "성인/";
			mon = "/5000원 ";
		}
		System.out.println(s + mon + "입니다.");
		
		in.close();
	}

}

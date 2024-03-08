package com.javaxe.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		//알파벳을 입력받아 자음, 모음구분
		//*switch문 사용
		//*영어 소문자 이외의 값은 고려하지 않는다.
		
		Scanner in = new Scanner(System.in);
		String en;
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳 : ");
		en = in.nextLine();
		
		switch(en) {
		
		case "b" :
		case "c" :
		case "d" :
		case "f" :
		case "g" :
		case "h" :
		case "j" :
		case "k" :
		case "l" :
		case "m" :
		case "n" :
		case "p" :
		case "q" :
		case "r" :
		case "s" :
		case "t" :
		case "v" :
		case "w" :
		case "x" :
		case "z" :
			System.out.println("모음입니다.");
			break;
		case "a" :
		case "e" :
		case "i" :
		case "o" :
		case "u" :
			System.out.println("자음입니다.");
			break;
			
		}
		
		
		in.close();
	}

}

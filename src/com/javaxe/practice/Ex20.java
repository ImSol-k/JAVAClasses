package com.javaxe.practice;

import java.util.Scanner;

	public class Ex20 {
		public static void main(String[] args) {
			
			//알파벳 입력받아 자음,모음 구분
			//if문사용
			//영문 소문자 이외의 입력값은 고려하지 않는다.
		
			Scanner in = new Scanner(System.in);
			String en;
			
			System.out.println("알파벳 1글자(소문자)를 입력하세요");
			System.out.print("알파벳 : ");
			en = in.nextLine();
			
			if(en.equals("a") || en.equals("e") || en.equals("i") || en.equals("o") || en.equals("u")) {
				System.out.println("모음입니다.");
			}
			else {
				System.out.println("자음입니다.");
			}
			
			
			
			
			in.close();
			
		}
	
	}

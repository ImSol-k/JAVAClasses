package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//반복문(for)
		//초기화, 조건식, 증감식이 한줄에 들어간다
		
		Scanner in = new Scanner(System.in);
		int j;
		
		System.out.print("반복횟수 : ");
		j = in.nextInt();
		
		for(int i = 0; i < j; i++) {
			System.out.println("I like Java" + i);
		}
		
		
		in.close();
	}

}

package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//반복문(while)
		//필수요소 초기값, 증감식, 조건식 
		Scanner in = new Scanner(System.in);
		int i = 0;
		int j;
		
		System.out.print("반복횟수 : ");
		j = in.nextInt();
		
		
		while(i < j) {		
			
			System.out.println("I like Java" + i);
			
			i++;
		}
		
		in.close();
	}

}

package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int score;
		
		System.out.print("점수 : ");
		score = in.nextInt();
		
		if(score >= 60 && score <= 100) {
			//true
			System.out.println("합격입니다.");
		}
		
		else if(score > 60 && score <= 100) {
			System.out.println("불합격입니다.");
		}
		
		else  {
			//false
			System.out.println("점수범위에서 벗어남");
		}
		
		
		in.close();
		
		
	}

}

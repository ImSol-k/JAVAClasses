package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//조건문 if(조건식)
		//조건식의 값은 무조건 boolen값
		
		Scanner in = new Scanner(System.in);
		int score;
		
		
		System.out.print("점수 : ");
		score = in.nextInt();
				
		//score가 60이상이면
		if(60 <= score) {
			//true
			System.out.println("합격입니다.");
		}
		
		
		in.close();
					

	}

}

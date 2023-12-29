package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//5개의 숫자를 키보드로 입력받아 평균구하는 프로그램 작성
		
		Scanner in =new Scanner(System.in);
		float[] num = new float[5];
		float average;
		float sum = 0;
		
		for(int i = 0; i < 5; i++) {
			num[i] = in.nextInt();
			sum = num[i] + sum;
		}
		average = sum / num.length;
		System.out.println("평균은 " + average + " 입니다.");
		
		in.close();
	}

}

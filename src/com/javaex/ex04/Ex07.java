package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
				
		//2단부터 시작
		int dan=2;
		int sum;
		
		//총 9단까지 출력한다
		for(int i = 1; i < 9; i++) {
			
			//곱셈연산하는 for문
			for(int j = 1; j <= 9; j++) {
			sum = dan * j;
			System.out.println(dan + " * " + j + " = " + sum);			
			}
			
			//한 단이 끝날때마다 단+1, 개행
			dan++;
			System.out.println();
		}
		
		
	}

}

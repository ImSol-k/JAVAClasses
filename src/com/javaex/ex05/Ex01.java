package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		//랜덤함수 사용
		//1~45까지 랜덤한숫자 6개 출력
		
		int num;
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
				
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);
		
		for(int i = 0; i < 6; i++) {
			num = (int)(Math.random() * 45) + 1;
			System.out.print(num + " ");
			System.out.println(i);
		}
		
		
	}

}

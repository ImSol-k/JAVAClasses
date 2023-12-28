package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		//구구단 출력
		
		int result;
		
		//단수 * 9까지 출력한다
		for(int i = 1; i <= 9; i++) {
			//2단부터 9단까지 출력한다
			for(int j = 2; j <= 9; j++) {
				//구구단 값 저장
				result = j * i;
				System.out.print(j + " * " + i + " = " + result + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
